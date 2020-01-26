function datesUntilNewYear() {
    var now = new Date();
    var newYear = new Date('January 1, ' + (now.getFullYear() + 1));
    var diff = newYear - now;
    var milliseconds = Math.floor(diff % 1000);
    diff = diff / 1000;
    var seconds = Math.floor(diff % 60);
    diff = diff / 60;
    var minutes = Math.floor(diff % 60);
    diff = diff / 60;
    var hours = Math.floor(diff % 24);
    diff = diff / 24;
    var days = Math.floor(diff);
    var outStr = '내년도 신정까지 ' + days + '일 ' + hours + '시간 ' + minutes;
    outStr += '분 ' + seconds + '초' + ' 남았읍니다.';

    document.getElementById('remaining').innerHTML = outStr;
    // 1초가 지나면 다시 함수를 호출한다. 
    setTimeout("datesUntilNewYear()", 1000);
}

function newYearRemain() {
    var now = new Date();
    var newYear = new Date("Jan 1," + (now.getFullYear() + 1));
    var diff = newYear - now;
    var millis = Math.floor(diff % 1000);
    diff = diff / 1000;
    var s = Math.floor(diff % 60);
    diff = diff / 60;
    var m = Math.floor(diff % 60);
    diff = diff / 60;
    var h = Math.floor(diff % 24);
    diff = diff / 24;
    var d = Math.floor(diff);

    var str = "New Year is remain " + d + " " + h + " " + m + " " + s + " ";
    document.getElementById("remaining2").innerHTML = str;
    setTimeout("newYearRemain()", 1000);
}

function newYear() {
    var now = new Date();
    var newYear = new Date("Jan 1, " + (now.getFullYear() + 1));
    var diff = newYear - now;
    var milliseconds = Math.floor(diff % 1000);
    diff = diff / 1000;
    var s = Math.floor(diff % 60);
    diff = diff / 60;
    var m = Math.floor(diff % 60);
    diff = diff / 60;
    var h = Math.floor(diff % 24);
    diff = diff / 24;
    var d = Math.floor(diff);

    var str = "New Year is " + d + " " + h + " " + m + " " + s + " ";

    document.getElementById("remaining2").innerHTML = str;

    setTimeout("newYear()", 1000);
}