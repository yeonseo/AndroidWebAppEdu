<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>YanBug - 게시판</title>
	<link rel="stylesheet" type="text/css" href="./css/common.css">
	<link rel="stylesheet" type="text/css" href="./css/board.css">

	<link rel="stylesheet" href="./css/normalize.css">
	<link rel="stylesheet" href="./css/main.css">
	<script src="./js/vendor/modernizr.custom.min.js"></script>
	<script src="./js/vendor/jquery-1.10.2.min.js"></script>
	<script src="./js/vendor/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="./js/main.js"></script>
	<script>
		function check_input() {
			if (!document.board_form.subject.value) {
				alert("제목을 입력하세요!");
				document.board_form.subject.focus();
				return;
			}
			if (!document.board_form.content.value) {
				alert("내용을 입력하세요!");
				document.board_form.content.focus();
				return;
			}
			document.board_form.submit();
		}
	</script>
</head>

<body>
	<header>
		<?php include "header.php"; ?>
	</header>
	<?php
	if (!$userid) {
		echo ("<script>
				alert('로그인 후 이용해주세요!');
				history.go(-1);
				</script>
			");
		exit; //php명령어, 초보자를 위해서 끝난다는 의미로 써준다ㅑㅏ
	}
	?>
	<section>
		<div id="main_img_bar">
			<!-- <img src="./img/main_img.png"> -->
			<?php include "main_slide.php"; ?>
		</div>
		<div id="board_box">

			<?php
			$num = "";
			$page = "";

			$subject = "";
			$content = "";
			$file_name = "";
			$board_mode = "";

			if (isset($_GET["board_mode"])) {
				$board_mode = $_GET["board_mode"];

				if (!isset($con)) {
					include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
				}

				$num  = $_GET["num"];
				$page = $_GET["page"];
				$sql = "select * from board where num=$num";
				$result = mysqli_query($con, $sql);
				$row = mysqli_fetch_array($result);

				if ($board_mode === "board_modify") {
					echo "<h3 id=\"board_title\">게시판 > 글 수정하기 </h3>";

					$$username = $row["name"];
					$subject    = $row["subject"];
					$content    = $row["content"];
					$file_name  = $row["file_name"];
				} else if ($board_mode === "board_reply") {
					echo "<h3 id=\"board_title\">게시판 > 글 답장하기 </h3>";

					$username  = $_SESSION["username"];

					$subject    = "Re : ";
					$subject   .= $row["subject"];

					$content    = " \n --------------------------------------------------------------------";
					$content   .= " \n Re ( $num ): ";
					$content   .=  $row["content"];

					$file_name  = $row["file_name"];
				}
			} else {
				echo "<h3 id=\"board_title\">게시판 > 글 쓰기 </h3>";
			}
			?>

			<form name="board_form" method="post" action="board_insert.php
			<?php
			if (isset($_GET["board_mode"])) {
				echo "?num=$num&page=$page&board_mode=$board_mode";
			}
			?>
			" enctype="multipart/form-data">
				<ul id="board_form">
					<li>
						<span class="col1">이름 : </span>
						<span class="col2"><?= $username ?></span>
					</li>
					<li>
						<span class="col1">제목 : </span>
						<span class="col2"><input name="subject" type="text" value="<?= $subject ?>"></span>
					</li>
					<li id="text_area">
						<span class="col1">내용 : </span>
						<span class="col2">
							<textarea name="content"><?= $content ?></textarea>
						</span>
					</li>
					<li>
						<span class="col1"> 첨부 파일 : </span>
						<?php
						if ($board_mode === "board_modify") {
							echo "
								<span class=\"col2\">$file_name</span>
								<br />
								<span class=\"col1\"> 첨부 파일 변경하기 : </span>";
						}
						?>
						<span class="col2"><input type="file" name="upfile"></span>
					</li>
				</ul>
				<ul class="buttons">
					<li><button type="button" onclick="check_input()">완료</button></li>
					<li><button type="button" onclick="location.href='board_list.php'">목록</button></li>
				</ul>
			</form>
		</div> <!-- board_box -->
	</section>
	<footer>
		<?php include "footer.php"; ?>
	</footer>
</body>

</html>