$(document).ready(function () {
    $("td").css("border", "1px solid gray");
    $("span").css("visibility", "hidden");
});

function redBox(id, res) {
    // document.getElementById(id).style.border = "2px solid red";
    if (res === "ok") {
        document.getElementById(id).style.background = "white";
    } else {
        document.getElementById(id).style.background = "red";
    }
}


function checkJoinForm(id) {
    //진상을 위한~~~
    var value1 = /^[a-zA-Z가-힣]{1}[a-zA-Z가-힣\x20]{1,7}$/;
    var value2 = /^[0-9]{6}$/;
    var value3 = /^[0-9]{7}$/;
    var value4 = /^[a-zA-Z]{1}[a-zA-Z0-9]{7,11}$/;

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
        case "txtNum1":
            if (!value2.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtNum2 + span").text("주민번호 앞자리는 6자리입니다.");
                    $("#txtNum2 + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtNum2 + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtNum2":
            if (!value3.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtNum2 + span").text("주민번호 뒷자리는 7자리입니다.");
                    $("#txtNum2 + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtNum2 + span").css("visibility", "hidden");
                });
            }
            break;
        case "txtID":
            if (!value4.test(testStr)) {
                redBox(id, "no");
                $(document).ready(function () {
                    $("#txtID + span").css("visibility", "visible");
                });
            } else {
                redBox(id, "ok");
                $(document).ready(function () {
                    $("#txtID + span").css("visibility", "hidden");
                });
            }
            break;
    }
}
