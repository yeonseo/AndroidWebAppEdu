<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<title>YanBug - 메세지</title>
	<link rel="stylesheet" type="text/css" href="./css/common.css">
	<link rel="stylesheet" type="text/css" href="./css/message.css">

	<link rel="stylesheet" href="./css/normalize.css">
	<link rel="stylesheet" href="./css/main.css">
	<script src="./js/vendor/modernizr.custom.min.js"></script>
	<script src="./js/vendor/jquery-1.10.2.min.js"></script>
	<script src="./js/vendor/jquery-ui-1.10.3.custom.min.js"></script>
	<script src="./js/main.js"></script>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css" />

	<script>
		function check_input() {
			if (!document.message_form.rv_id.value) {
				alert("수신 아이디를 입력하세요!");
				document.message_form.rv_id.focus();
				return;
			}
			if (!document.message_form.subject.value) {
				alert("제목을 입력하세요!");
				document.message_form.subject.focus();
				return;
			}
			if (!document.message_form.content.value) {
				alert("내용을 입력하세요!");
				document.message_form.content.focus();
				return;
			}
			document.message_form.submit();
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
		<div id="message_box">
			<h3 id="write_title">
				쪽지 보내기
			</h3>
			<ul class="top_buttons">

				<i class="fas fa-sign-in-alt"></i>
				<li><span><a href="message_box.php?mode=rv">수신 쪽지함 </a></span></li>

				<i class="fas fa-sign-out-alt"></i>
				<li><span><a href="message_box.php?mode=send">송신 쪽지함</a></span></li>
			</ul>
			<form name="message_form" method="post" action="message_insert.php?send_id=<?= $userid ?>">
				<div id="write_msg">
					<ul>
						<li>
							<span class="col1">보내는 사람 : </span>
							<span class="col2"><?= $userid ?></span>
						</li>
						<li>
							<span class="col1">수신 아이디 : </span>
							<span class="col2"><input name="rv_id" type="text"></span>
						</li>
						<li>
							<span class="col1">제목 : </span>
							<span class="col2"><input name="subject" type="text"></span>
						</li>
						<li id="text_area">
							<span class="col1">내용 : </span>
							<span class="col2">
								<textarea name="content"></textarea>
							</span>
						</li>
					</ul>
					<button type="button" onclick="check_input()">보내기</button>
				</div>
			</form>
		</div> <!-- message_box -->
	</section>
	<footer>
		<?php include "footer.php"; ?>
	</footer>
</body>

</html>