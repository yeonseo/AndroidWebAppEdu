<?php
session_start(); // 일반인, 회원가입자, 관리자 구분
include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/create_table.php";

if (isset($_SESSION["userid"])) $userid = $_SESSION["userid"];
else $userid = "";
if (isset($_SESSION["username"])) $username = $_SESSION["username"];
else $username = "";
if (isset($_SESSION["userlevel"])) $userlevel = $_SESSION["userlevel"];
else $userlevel = "";
if (isset($_SESSION["userpoint"])) $userpoint = $_SESSION["userpoint"];
else $userpoint = "";

?>
<div id="top">
    <h3>
        <a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/index.php">YanBug의 홈페이지</a>
    </h3>
    <ul id="top_menu">
        <?php
        if (!$userid) { //세션값에 아무것도 없으면 true 실행!
        ?>
            <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/member_form.php">회원 가입</a> </li>
            <li> | </li>
            <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/login_form.php">로그인</a></li>
        <?php
        } else {
            //관리자이거나 유저이거나 둘 중 하나
            $logged = $username . "(" . $userid . ")님[Level:" . $userlevel . ", Point:" . $userpoint . "]";
        ?>
            <li><?= $logged ?> </li>
            <li> | </li>
            <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/logout.php">로그아웃</a> </li>
            <li> | </li>
            <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/member_modify_form.php">정보 수정</a></li>
        <?php
        }
        ?>
        <?php
        if ($userlevel == 1) {
        ?>
            <li> | </li>
            <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/admin.php">관리자 모드</a></li>
        <?php
        }
        ?>
    </ul>
</div>
<div id="menu_bar">
    <ul>
        <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/index.php">HOME</a></li>
        <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/message_form.php">쪽지 보내기</a></li>
        <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/board_list.php">게시판</a></li>
        <li><a href="http://<?php echo $_SERVER['HTTP_HOST']; ?>/yanbug/board_form.php">게시판 글쓰기</a></li>
    </ul>
</div>