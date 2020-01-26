/*
* 공그리기 정규화 확인 함수
*/

var context;
var dx = 5;
var dy = 5;
var y = 100;
var x = 100;

function redBox(id, res) {
    // document.getElementById(id).style.border = "2px solid red";
    if (res === "ok") {
        document.getElementById(id).style.background = "white";
    } else {
        document.getElementById(id).style.background = "red";
    }
}

/*
* 공그리기 정규화 확인 함수
*/

function numberCheck(id, num) {
    var checkChar = /\d/;
    if (num.match(checkChar)) {
        return parseInt(num);
    } else {
        document.getElementById(id).value = "";
        alert("숫자만 입력하세요!");
        return 0;
    }
}

/*
* 공그리기 정규화 확인 함수
*/

function formCheck(id) {
    switch (id) {
        case "dxValue":
            dx = numberCheck(id, document.getElementById("dxValue").value);
            if (dx < 5 || dx > 10) {
                redBox("dxValue", "no");
            } else {
                redBox("dxValue", "ok");
            }
            break;
        case "dyValue":
            dy = numberCheck(id, document.getElementById("dyValue").value);
            if (dy < 5 || dy > 10) {
                redBox("dyValue", "no");
            } else {
                redBox("dyValue", "ok");
            }
            break;
        case "xValue":
            x = numberCheck(id, document.getElementById("xValue").value);
            if (x < (300 + 20) || x > (500 - 20)) {
                redBox("xValue", "no");
            } else {
                redBox("xValue", "ok");
            }
            break;
        case "yValue":
            y = numberCheck(id, document.getElementById("yValue").value);
            if (y < (200 + 20) || y > (300 - 20)) {
                redBox("yValue", "no");
            } else {
                redBox("yValue", "ok");
            }
            break;
    }
}

/*
* 공 움직이게 함수
*/

function draw() {

    var canvas3 = document.getElementById('ball');
    var context3 = canvas3.getContext('2d');
    context3.clearRect(0, 0, 500, 300);
    context3.beginPath();
    context3.fillStyle = "red";
    context3.arc(x, y, 20, 0, Math.PI * 2, true);
    context3.closePath();
    context3.fill();
    if (x < (0 + 20) || x > (500 - 20))
        dx = -dx;
    if (y < (0 + 20) || y > (300 - 20))
        dy = -dy;
    x += dx;
    y += dy;
}

/*
* 도형관련 함수
*/

var intervalValue;
function ballDraw() {
    var canvas1 = document.getElementById("myCanvas1");
    var context1 = canvas1.getContext("2d");
    context1.fillStyle = "#00FF00";
    context1.moveTo(0, 0);
    context1.fillRect(0, 0, 100, 50);

    // var canvas4 = document.getElementById("myCanvas2");
    // canvas4.fillRect(0, 0, 100, 50);

    var canvas2 = document.getElementById('linePath1');
    var context2 = canvas2.getContext('2d');

    context2.beginPath();
    context2.moveTo(0, 0);
    context2.lineTo(100, 100);
    context2.lineTo(150, 50);
    context2.lineTo(200, 100);
    context2.stroke();

    var canvas5 = document.getElementById('linePath2');
    var context5 = canvas5.getContext('2d');

    context5.beginPath();
    context5.moveTo(0, 100);
    context5.lineTo(50, 0);
    context5.lineTo(100, 100);
    context5.lineTo(150, 0);
    context5.lineTo(200, 100);
    context5.lineTo(250, 0);
    context5.lineTo(300, 100);
    context5.lineTo(350, 0);
    context5.lineTo(400, 100);
    context5.stroke();

    intervalValue = setInterval(draw, 10);
}

function stopIntervalBall() {
    clearInterval(intervalValue);
}

/*
* 과일체크 함수
*/

function checkFruit(elem, msg) {
    if (elem.value === '0') {
        alert(msg);
        elem.focus();
        return false;
    } else {
        alert(document.getElementById('fruits').options[elem.value].text + "을(를) 좋아하시는군요?!");
        return true;
    }
}

/*
* 알러트 함수
*/

function alertTest() {
    alert("자바스크립트를 잘해야 제이쿼리도 잘합니다 :-)");
}

/*
* 텍스트 바꾸기 함수
*/

function msgChangeTest() {
    document.getElementById('changeMsg').innerHTML = "봄이 오면 꽃들이 피겠지요.";
    document.getElementById('back').style.visibility = 'visible';
    document.getElementById('heart').style.visibility = 'visible';
}

/*
* 이미지 바꾸기 함수
*/

function imageSrcChange() {
    var imgSrc = document.getElementById("image").src.toString();
    var str = "file:///Users/nambbo/Documents/GitHub/AndroidWebAppEdu/WebEdu/JavaScript/image/image1.jpeg".toString();
    // alert(imgSrc);
    // alert(imgSrc == str);
    if (imgSrc === str) {
        document.getElementById("image").src = "file:///Users/nambbo/Documents/GitHub/AndroidWebAppEdu/WebEdu/JavaScript/image/image2.jpeg";
    } else {
        document.getElementById("image").src = "file:///Users/nambbo/Documents/GitHub/AndroidWebAppEdu/WebEdu/JavaScript/image/image1.jpeg";
    }
}

/*
* 회원가입 양식 함수
*/

function checkJoinForm(id) {
    var value1 = /^[가-힣]{2,4}$/;
    var value2 = /^[0-1]{3}-[0-9]{4}-[0-9]{4}$/;
    var value3 = /^[\w]+@[a-z]+.[a-z]+$/;
    var value4 = /^[1-9]{6,8}$/;

    var testStr = document.getElementById(id).value;
    switch (id) {
        case "txtName":
            if (!value1.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtName + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtName + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtPhone":
            if (!value2.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtPhone + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtPhone + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtEmail":
            if (!value3.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtEmail + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtEmail + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtPassword":
            if (!value4.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtPassword + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtPassword + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtPasswordCheck":
            if (!value4.test(testStr) || testStr !== document.getElementById('txtPassword').value) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtPasswordCheck + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtPasswordCheck + span").css("visibility", "hidden");
                });
            }
            break;
    }
}
