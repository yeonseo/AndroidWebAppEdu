<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>YanBug - 정보수정</title>
	<link rel="stylesheet" href="./css/normalize.css">
	<link rel="stylesheet" href="./css/main.css">
	<link rel="stylesheet" type="text/css" href="./css/common.css">
	<link rel="stylesheet" type="text/css" href="./css/member.css">
	<link rel="stylesheet" type="text/css" href="./css/registration_form.css">
	<script type="text/javascript" src="./js/member_modify.js"></script>
	<script language="JavaScript" type="text/javascript" src="./js/registration_form.js"></script>

	<script src="./js/vendor/modernizr.custom.min.js"></script>
	<script src="./js/vendor/jquery-1.10.2.min.js"></script>
	<script src="./js/vendor/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="./js/main.js"></script>
</head>

<body>
	<header>
		<?php include "header.php"; ?>
	</header>
	<?php
	if (!isset($con)) {
		include $_SERVER['DOCUMENT_ROOT'] . "/yanbug/common/lib/db_connector.php";
	}
	$sql    = "select * from members where id='$userid'";
	$result = mysqli_query($con, $sql);
	$row    = mysqli_fetch_array($result);

	$pass = $row["pass"];
	$name = $row["name"];

	$email = explode("@", $row["email"]);
	$email1 = $email[0];
	$email2 = $email[1];

	mysqli_close($con);
	?>
	<section>
		<div id="main_img_bar">
			<!-- <img src="./img/main_img.png"> -->
			<?php include "main_slide.php"; ?>
		</div>



		<div id="container">
			<form action="member_modify.php?id=<?= $userid ?>" name="member_form" method="POST">
				<h1>Registration <strong>Form</strong> </h1>
				<hr>
				<div class="inputContainer">
					<input type="text" id="inputUserName" name="name" onkeyup="checkJoinForm('inputUserName')" value=<?= $name ?> />
					<label for="usern">Username</label>
					<div class="warningIcon">!</div>
					<div class="warningMessage">이름은 영문, 한글 조합으로 2~8자입니다.</div>
				</div>
				<div class="inputContainer">
					<input type="text" id="inputID" name="id" onkeyup="checkJoinForm('inputID')" value=<?= $userid ?> readonly />
					<label for="usern">ID</label>
					<div class="warningIcon">!</div>
					<div class="warningMessage">아이디는 영문, 숫자 조합으로 6~12자입니다.</div>
				</div>
				<div class="inputContainer">
					<input type="password" id="inputPassword" name="pass" onkeyup="checkJoinForm('inputPassword')" />
					<label for="usern">Password</label>
					<div class="warningIcon">!</div>
					<div class="warningMessage">비밀번호는 첫글자는 대문자이고, 영문, 숫자 조합으로 8~12자입니다.</div>
				</div>
				<div class="inputContainer">
					<input type="password" id="inputPasswordConf" name="pass_confirm" onkeyup="checkJoinForm('inputPasswordConf')" />
					<label for="usern">Pass Check</label>
					<div class="warningIcon">!</div>
					<div class="warningMessage">입력하신 비밀번호와 틀립니다.</div>
				</div>
				<div class="inputContainer">
					<input type="email" id="inputEmail" name="email1" onkeyup="checkJoinForm('inputEmail')" value=<?= $email1 ?>@<?= $email2 ?> />
					<label for="usern">Email</label>
					<div class="warningIcon">!</div>
					<div class="warningMessage">이메일은 xxx@domain.xxx 형식으로 입력해주세요.</div>
				</div>
				<div class="inputContainer">
					<input type="button" class="buttonContainer" id="resBtnComp" name="resBtn" onclick="registrationConfirmModi();" value="Registration !!" />
					<input type="button" class="buttonContainer" id="resBtnCanc" name="resBtn" onclick="reset_form();" value="Clear !!" />
				</div>
			</form>
		</div> <!-- container -->
	</section>
	<footer>
		<?php include "footer.php"; ?>
	</footer>
</body>

</html>