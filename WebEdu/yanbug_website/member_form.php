<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <title>YanBug - 회원가입</title>
    <link rel="stylesheet" type="text/css" href="./css/common.css">
    <link rel="stylesheet" type="text/css" href="./css/member.css">
    <link rel="stylesheet" type="text/css" href="./css/registration_form.css">
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script language="JavaScript" type="text/javascript" src="./js/registration_form.js"></script>
</head>

<body>
    <header>
        <?php include "header.php"; ?>
    </header>
    <section>
        <div id="main_img_bar">
            <img src="./img/main_img0.jpg">
        </div>

        <div id="container">
            <form action="member_insert.php" name="member_form" method="POST">
                <h1>Registration <strong>Form</strong> </h1>
                <hr>
                <div class="inputContainer">
                    <input type="text" id="inputUserName" name="name" onkeyup="checkJoinForm('inputUserName')" />
                    <label for="usern">Username</label>
                    <div class="warningIcon">!</div>
                    <div class="warningMessage">이름은 영문, 한글 조합으로 2~8자입니다.</div>
                </div>
                <div class="inputContainer">
                    <input type="text" id="inputID" name="id" onkeyup="checkJoinForm('inputID')" />
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
                    <input type="email" id="inputEmail" name="email1" onkeyup="checkJoinForm('inputEmail')" />
                    <label for="usern">Email</label>
                    <div class="warningIcon">!</div>
                    <div class="warningMessage">이메일은 xxx@domain.xxx 형식으로 입력해주세요.</div>
                </div>
                <div class="inputContainer">
                    <input type="button" class="buttonContainer" id="resBtnComp" name="resBtn" onclick="registrationConfirm();" value="Registration !!" />
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