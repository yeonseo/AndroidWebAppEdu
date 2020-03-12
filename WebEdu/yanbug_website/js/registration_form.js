let confirmArray = [false, false, false, false, false];

//입력할 당시 확인할 때
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
                    $("#inputID ~ .warningMessage").text("아이디는 영문, 숫자 조합으로 6~12자입니다.");
                });
            } else {
                confirmArray[1] = true;
                $(document).ready(function () {
                    $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "hidden");
                });
                check_id(testStr);
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
            if (passStr !== document.getElementById('inputPasswordConf').value) {
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


//전송 버튼 누를시 확인할 때,
function checkFinalJoinForm() {
    //진상을 위한~~~
    var value1 = /^[a-zA-Z가-힣]{1}[a-zA-Z가-힣\x20]{1,7}$/;
    var value2 = /^[a-zA-Z0-9]{6,12}$/;
    var value4 = /^[A-Z]{1}[a-zA-Z0-9]{7,11}$/;
    var value5 = /^[\w]+@[a-z]+.[a-z]+$/;

    var testStr;

    //NAME
    testStr = document.getElementById("inputUserName").value;
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

    testStr = document.getElementById("inputID").value;
    if (!value2.test(testStr)) {
        confirmArray[1] = false;
        $(document).ready(function () {
            $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "visible");
            $("#inputID ~ .warningMessage").text("아이디는 영문, 숫자 조합으로 6~12자입니다.");
        });
    } else {
        confirmArray[1] = true;
        $(document).ready(function () {
            $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "hidden");
        });
        check_id(testStr);
    }
    testStr = document.getElementById("inputPassword").value;
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
    testStr = document.getElementById("inputPasswordConf").value;
    let passStr = document.getElementById('inputPassword').value;
    if (passStr !== document.getElementById('inputPasswordConf').value) {
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

    testStr = document.getElementById("inputEmail").value;
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
}


//수정화면에서 전송 버튼 누를시 확인할 때,
function checkFinalModiForm() {
    //진상을 위한~~~
    var value1 = /^[a-zA-Z가-힣]{1}[a-zA-Z가-힣\x20]{1,7}$/;
    var value2 = /^[a-zA-Z0-9]{6,12}$/;
    var value4 = /^[A-Z]{1}[a-zA-Z0-9]{7,11}$/;
    var value5 = /^[\w]+@[a-z]+.[a-z]+$/;

    var testStr;

    //NAME
    testStr = document.getElementById("inputUserName").value;
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

    testStr = document.getElementById("inputID").value;
    if (!value2.test(testStr)) {
        confirmArray[1] = false;
        $(document).ready(function () {
            $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "visible");
            $("#inputID ~ .warningMessage").text("아이디는 영문, 숫자 조합으로 6~12자입니다.");
        });
    } else {
        confirmArray[1] = true;
        $(document).ready(function () {
            $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "hidden");
        });
    }
    testStr = document.getElementById("inputPassword").value;
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
    testStr = document.getElementById("inputPasswordConf").value;
    let passStr = document.getElementById('inputPassword').value;
    if (passStr !== document.getElementById('inputPasswordConf').value) {
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

    testStr = document.getElementById("inputEmail").value;
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

    alert(confirmArray.toString());
}


//GET방식으로 전송, AJAX 사용
function check_id(inputID) {
    $.ajax({
        url: "member_check_id_ajax.php?id=" + inputID,
        type: "get",
        success: function (returnData) {
            //아이디 중복시
            if (returnData === "ID_overlap") {
                $(document).ready(function () {
                    $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "visible");
                });
                $("#inputID ~ .warningMessage").text("사용중인 아이디입니다.");
                confirmArray[1] = false;
            } else if (returnData === "ID_possible") {
                //사용가능한 아이디
                $(document).ready(function () {
                    $("#inputID ~ .warningIcon, #inputID ~ .warningMessage").css("visibility", "hidden");
                });
                confirmArray[1] = true;
            } else {
                console.log("DB 통신 오류" + returnData);
                confirmArray[1] = false;
            }
        },
        error: function () {
            console.log("아이디 중복확인 ajax 실패");
        }
    });
}

function registrationConfirm() {
    checkFinalJoinForm();
    let i;
    for (i = 0; i < confirmArray.length; i++) {
        if (!confirmArray[i]) {
            $(document).ready(function () {
                $('input:nth(' + i + ')').focus();
            });
            return;
        }
    }
    // window.location.href = './test_login_form.html';
    document.member_form.submit();
}
function registrationConfirmModi() {
    checkFinalModiForm();
    let i;
    for (i = 0; i < confirmArray.length; i++) {
        if (!confirmArray[i]) {
            $(document).ready(function () {
                $('input:nth(' + i + ')').focus();
            });
            return;
        }
    }
    // window.location.href = './test_login_form.html';
    document.member_form.submit();
}

function reset_form() {
    document.member_form.id.value = "";
    document.member_form.pass.value = "";
    document.member_form.pass_confirm.value = "";
    document.member_form.name.value = "";
    document.member_form.email1.value = "";
    // document.member_form.email2.value = "";
    document.member_form.name.focus();
    return;
}