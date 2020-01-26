function cal() {
    var num1 = document.getElementById("num1").value;

    var num2 = document.getElementById("num2").value;
    var sum;

    if (num1 === "0" || num1 === "") {
        alert("정신차려!");
        document.getElementById("num1").focus();
        return false;
    } else if (num2 === "0" || num2 === "") {
        alert("정신차려!");
        document.getElementById("num2").focus();
        return false;
    }
    sum = parseInt(num1) + parseInt(num2);
    document.getElementById("sum").value = sum;
}

function myBackground(backColor) {
    if (backColor === 'red') {
        document.body.style.backgroundColor = "lightblue";
        return backColor = 'lightblue';
    } else {
        document.body.style.backgroundColor = "red";
        return backColor = 'red';
    }
}

function goodmorning() {
    var msg = '';
    var time = new Date().getHours();
    if (time < 9) {
        msg = "비콘하세요!! 얼른 학원으로 갑니다!!!";
    }
    else if (time < 18) {
        msg = "아직 퇴실하면 안되요~~~~";
    }
    else if (time >= 18) {
        msg = "수고했어요 :-) 비콘찍고 뱌뱌~~~";
    }
    alert(msg);
}

function grade() {
    var gradeInput = prompt('성적을 입력하세요~~', 'F');
    var grade = /^[A-Fa-f+]{1,1}$/;
    if (!grade.test(gradeInput)) {
        alert('A-F사이의 문자로 한글자만 써주세요~');
        return grade();
    } else {
        gradeInput = gradeInput.toUpperCase();
    }
    switch (gradeInput) {
        case 'A': alert("잘했어요!");
            break;
        case 'B': alert("좋은 점수군요");
            break;
        case 'C': alert("괜찮은 점수군요");
            break;
        case 'D': alert("좀더 노력하세요");
            break;
        case 'F': alert("다음학기 수강하세요");
            break;
        default: alert("알수없는 학점입니다.")
    }
}