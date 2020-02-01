let confirmArray = [false, false, false, false, false];
function checkJoinForm(id) {
    //진상을 위한~~~
    var value1 = /^[a-zA-Z가-힣]{1}[a-zA-Z가-힣\x20]{1,7}$/;
    var value2 = /^[a-zA-Z0-9]{6,12}$/;
    var value4 = /^[A-Z]{1}[a-zA-Z0-9]{7,11}$/;
    var value5 = /^[\w]+@[a-z]+.[a-z]+$/;

    var testStr = document.getElementById(id).value;


    switch (id) {
        case "inputUserName":
            if (!value1.test(testStr)) {
                confirmArray[0] = false;
                $(document).ready(function () {
                    $("#inputUserName ~ .warningIcon, #inputUserName ~ .warningMessage").css("visibility", "visible");
                });
            } else {
                confirmArray[0] = true;
                $(document).ready(function () {
                    $("#inputUserName ~ .warningIcon, #inputUserName ~ .warningMessage").css("visibility", "hidden");
                });
            }
            break;
        case "inputID":
            if (!value2.test(testStr)) {
                confirmArray[1] = false;
                $(document).ready(function () {
                    $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "visible");
                });
            } else {
                confirmArray[1] = true;
                $(document).ready(function () {
                    $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "hidden");
                });
            }
            break;
        case "inputPassword":
            if (!value4.test(testStr)) {
                confirmArray[2] = false;
                $(document).ready(function () {
                    $("#inputPassword ~ .warningIcon, #inputPassword ~ .warningMessage").css("visibility", "visible");
                });
            } else {
                confirmArray[2] = true;
                $(document).ready(function () {
                    $("#inputPassword ~ .warningIcon, #inputPassword ~ .warningMessage").css("visibility", "hidden");
                });
            }
            break;
        case "inputPasswordConf":
            let passStr = document.getElementById('inputPassword').value;
            if (!value4.test(testStr) || passStr !== document.getElementById('inputPasswordConf').value) {
                confirmArray[3] = false;
                $(document).ready(function () {
                    $("#inputPasswordConf ~ .warningIcon, #inputPasswordConf ~ .warningMessage").css("visibility", "visible");
                });
            } else {
                confirmArray[3] = true;
                $(document).ready(function () {
                    $("#inputPasswordConf ~ .warningIcon, #inputPasswordConf ~ .warningMessage").css("visibility", "hidden");
                });
            }
            break;
        case "inputEmail":
            if (!value5.test(testStr)) {
                confirmArray[4] = false;
                $(document).ready(function () {
                    $("#inputEmail ~ .warningIcon, #inputEmail ~ .warningMessage").css("visibility", "visible");
                });
            } else {
                confirmArray[4] = true;
                $(document).ready(function () {
                    $("#inputEmail ~ .warningIcon, #inputEmail ~ .warningMessage").css("visibility", "hidden");
                });
            }
            break;
    }
}

function registrationConfirm() {
    let i;
    for (i = 0; i < confirmArray.length; i++) {
        if (!confirmArray[i]) {
            $(document).ready(function () {
                $('input:nth(' + i + ')').focus();
            });
            return;
        }
    }
    window.location.href = './test_login_form.html';
}



function TestClass() {
    var a = null;
    var b = null;
    var c = null;
    function aaa() {
        a = a + a;
    }

}
function testLogin() {
    let id, pass;
    id = $('#inputID').val();
    pass = $('#inputPassword').val();

    if (id === "matzip1" && pass === "A12341234") {
        alert("환영합니다. :-)");
    } else {
        alert("아이디와 비밀번호가 틀렸습니다.");
    }

}

