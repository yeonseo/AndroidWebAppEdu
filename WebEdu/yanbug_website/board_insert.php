<meta charset="utf-8">
<?php
session_start();
if (isset($_SESSION["userid"])) $userid = $_SESSION["userid"];
else $userid = "";
if (isset($_SESSION["username"])) $username = $_SESSION["username"];
else $username = "";

if (!$userid) {
	echo ("
                    <script>
                    alert('게시판 글쓰기는 로그인 후 이용해 주세요!');
                    history.go(-1)
                    </script>
        ");
	exit;
}

$group_num = 0;
$group_depth = 0;
$group_order = 0;

$subject = $_POST["subject"];
$content = $_POST["content"];

$subject = htmlspecialchars($subject, ENT_QUOTES);
$content = htmlspecialchars($content, ENT_QUOTES);

$regist_day = date("Y-m-d (H:i)");  // 현재의 '년-월-일-시-분'을 저장

$upload_dir = './data/';

$upfile_name	 = $_FILES["upfile"]["name"];
$upfile_tmp_name = $_FILES["upfile"]["tmp_name"];
$upfile_type     = $_FILES["upfile"]["type"];
$upfile_size     = $_FILES["upfile"]["size"];
$upfile_error    = $_FILES["upfile"]["error"];

if ($upfile_name && !$upfile_error) {
	$file = explode(".", $upfile_name);
	$file_name = $file[0];
	$file_ext  = $file[1];

	$new_file_name = date("Y_m_d_H_i_s") . "_" . $file_name;
	// $new_file_name = $new_file_name;
	$copied_file_name = $new_file_name . "." . $file_ext;
	$uploaded_file = $upload_dir . $copied_file_name;

	if ($upfile_size  > 10000000) {
		echo ("
				<script>
				alert('업로드 파일 크기가 지정된 용량(10MB)을 초과합니다!<br>파일 크기를 체크해주세요! ');
				history.go(-1)
				</script>
				");
		exit;
	}

	if (!move_uploaded_file($upfile_tmp_name, $uploaded_file)) {
		echo ("
					<script>
					alert('파일을 지정한 디렉토리에 복사하는데 실패했습니다.');
					history.go(-1)
					</script>
				");
		exit;
	}
} else {
	$upfile_name      = "";
	$upfile_type      = "";
	$copied_file_name = "";
}

if (!isset($con)) {
	include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
}


function func_board_default($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type)
{
	//게시물 기본값 설정
	$group_num = 0;
	$group_depth = 0;
	$group_order = 0;

	$sql = "insert into board (group_num, group_depth, group_order, id, name, subject, content, regist_day, hit, file_name, file_copied, file_type) ";
	$sql .= "values('$group_num','$group_depth','$group_order', '$userid', '$username', '$subject', '$content', '$regist_day', 0, '$upfile_name', '$copied_file_name', '$upfile_type' )";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: 1) ' . $sql . mysqli_error($con));
	}

	//현재 최대큰번호를 가져와서 그룹번호로 저장하기
	$sql = "SELECT max(num) from board;";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: 2) ' . mysqli_error($con));
	}
	$row = mysqli_fetch_array($result);
	$max_num = $row['max(num)'];
	$sql = "UPDATE `board` SET `group_num`= $max_num WHERE `num`=$max_num;";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: 3) ' . mysqli_error($con));
	}
}


function func_board_modify($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type)
{
	$num = $_GET["num"];
	$page = $_GET["page"];

	$sql = "update board set subject='$subject', content='$content', file_name='$upfile_name', file_type='$upfile_type', file_copied='$copied_file_name' ";
	$sql .= " where num=$num";
	mysqli_query($con, $sql);

	mysqli_close($con);

	echo "
	      <script>
	          location.href = 'board_list.php?page=$page';
	      </script>
	  ";
	exit;
}

function func_board_reply($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type)
{
	$num = $_GET["num"];
	$page = $_GET["page"];

	$group_num = mysqli_real_escape_string($con, $num);
	$sql = "SELECT * from board where num =$group_num;";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: ' . mysqli_error($con));
	}
	$row = mysqli_fetch_array($result);

	//현재 그룹넘버값을 가져와서 저장한다.
	$group_num = (int) $row['group_num'];
	//현재 들여쓰기값을 가져와서 증가한후 저장한다.
	$group_depth = (int) $row['group_depth'] + 1;
	//현재 순서값을 가져와서 증가한후 저장한다.
	$group_order = (int) $row['group_order'] + 1;

	//현재 그룹넘버가 같은 모든 레코드를 찾아서 현재 $ord값보다 같거나 큰 레코드에 $ord 값을 1을 증가시켜 저장한다.
	$sql = "UPDATE `board` SET `group_order`=`group_order`+1 WHERE `group_num` = $group_num and `group_order` >= $group_order";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: ' . mysqli_error($con));
	}

	$sql = "insert into board (group_num, group_depth, group_order, id, name, subject, content, regist_day, hit, file_name, file_copied, file_type) ";
	$sql .= "values('$group_num','$group_depth','$group_order', '$userid', '$username', '$subject', '$content', '$regist_day', 0, '$upfile_name', '$copied_file_name', '$upfile_type' )";
	$result = mysqli_query($con, $sql);
	if (!$result) {
		die('Error: ' . mysqli_error($con));
	}

	mysqli_close($con);

	echo "
	      <script>
	          location.href = 'board_list.php?page=$page';
	      </script>
	  ";
	exit;
}

function func_board_insert($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type)
{
	// 포인트 부여하기
	$point_up = 100;

	$sql = "select point from members where id='$userid'";
	$result = mysqli_query($con, $sql);
	$row = mysqli_fetch_array($result);
	$new_point = $row["point"] + $point_up;

	$sql = "update members set point=$new_point where id='$userid'";
	mysqli_query($con, $sql);

	mysqli_close($con);                // DB 연결 끊기

	echo "
	   <script>
	    location.href = 'board_list.php';
	   </script>
	";
}


$board_mode;
if (isset($_GET["board_mode"])) {
	$board_mode = $_GET["board_mode"];
} else {
	$board_mode = "";
}

switch ($board_mode) {
	case "board_modify":
		func_board_modify($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type);
		break;
	case "board_reply":
		// func_board_default($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type);
		func_board_reply($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type);
		break;
	case "":
		func_board_default($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type);
		func_board_insert($con, $userid, $username, $subject, $content, $regist_day, $upfile_name, $copied_file_name, $upfile_type);
		break;
}
?>