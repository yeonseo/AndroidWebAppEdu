function setClock() {
    var now = new Date();
    var s = now.getHours() + ":" + now.getMinutes() + ":" + now.getSeconds();
    document.getElementById("clock").innerHTML = s;
    setTimeout("setClock()", 1000);
}

function calc(type) {
    if (typeof parseInt(type) !== "number" || parseInt(type) > 4 || parseInt(type) < 1) {
        alert("입력한 숫자는 " + type + "입니다. 숫자를 입력 다시 입력하세요.");
        return;
    } else {
        x = Number(document.calculator.number1.value);
        if (type === 1)
            y = Math.sin((x * Math.PI) / 180.0);
        else if (type == 2)
            y = Math.log(x);

        else if (type == 3)
            y = Math.sqrt(x);
        else if (type == 4)
            y = Math.abs(x);
        document.calculator.total.value = y;
    }

}

function pushPopShift(num) {

    switch (num) {
        case 0:
            numbers.push(6);
            document.getElementById("arrayPop").innerHTML = numbers + '<BR>'; break;
        case 1: num++; item = numbers.pop();
            document.getElementById("arrayPop").innerHTML = numbers + '<BR>'; break;
        case 2: num++; item = numbers.shift();
            document.getElementById("arrayPop").innerHTML = item + '<BR>'; break;
        case 3:
            document.getElementById("arrayPop").innerHTML = numbers + '<BR>'; break;
    }
}

function date() {
    var d1 = new Date(2013, 7, 21, 0, 0, 0);
    var d2 = new Date("January 20, 2013  11:13:00");
    alert(d1);
    alert(d2);
}

function today() {
    var today = new Date();

    alert(today.toDateString() + "\n" +
        today.toISOString() + "\n" +
        today.toJSON() + "\n" +
        today.toLocaleDateString() + "\n" +
        today.toLocaleTimeString() + "\n" +
        today.toLocaleString() + "\n" +
        today.toString() + "\n" +
        today.toTimeString() + "\n" +
        today.toUTCString());
}

function checkDate() {
    var s = document.getElementById("pdate").value;
    var pdate = new Date(s);
    var today = new Date();
    var diff = today.getTime() - pdate.getTime();
    var days = Math.floor(diff / (1000 * 60 * 60 * 24));

    if (days > 7) {
        alert("교환 기한이 지났습니다.");
    } else {
        alert("교환이 가능하십니다.");
    }
}

function strConcat() {
    var str1 = "설날이 ";
    var str1 = "다가와여 :-)";
    var str3 = s1.concat(str2);

    alert(str3);
}

function strIndexOf() {
    var str = "문풍지 우는 겨울밤이면 윗목 물그릇에 살얼음이 어는데 \n 할머니는 이불 속에서 어린 나를 품어 안고 \n 몇 번이고 혼잣말로 중얼거리시네";
    var keyword = "할머니";
    var strFind = str.indexOf(keyword);
    var strMatch = str.match(keyword);
    var strReplace = str.replace(keyword, "아버지");

    alert("문장 \n " + str + "\n keyword : " + keyword
        + "\n strFind : " + strFind + "\n strMatch : " + strMatch
        + "\n strReplace - \n" + strReplace);
}

function randomStyle() {
    var s = "This is a test.";
    num = Math.floor(Math.random() * 4);
    switch (num) {
        case 0:
            document.write("Big: " + s.big() + "<br>"); break;
        case 1: num++; item = numbers.pop();
            document.write("Small: " + s.small() + "<br>"); break;
        case 2: num++; item = numbers.shift();
            document.write("Bold: " + s.bold() + "<br>"); break;
        case 3:
            document.write("Italic: " + s.italics() + "<br>"); break;
    }

    // document.write("Big: " + s.big() + "<br>");
    // document.write("Small: " + s.small() + "<br>");
    // document.write("Bold: " + s.bold() + "<br>");
    // document.write("Italic: " + s.italics() + "<br>");
    // document.write("Fixed: " + s.fixed() + "<br>");
    // document.write("Strike: " + s.strike() + "<br>");
    // document.write("Fontcolor: " + s.fontcolor("green") + "<br>");
    // document.write("Fontsize: " + s.fontsize(6) + "<br>");
    // document.write("Subscript: " + s.sub() + "<br>");
    // document.write("Superscript: " + s.sup() + "<br>");
    // document.write("Link: " + s.link("http://www.google.com") + "<br>");
}

function sort1(array) {
    var resArray = array.sort();
    alert(resArray.toString());
}
function sort2(array) {
    var resArray = array.sort(function (a, b) { return a - b });
    alert(resArray.toString());
}
function sliceArray(array) {
    var resArray = array.slice(3);
    alert(resArray.toString());
}
function joinArray(array) {
    var resArray = array.join(" * ");
    alert(resArray.toString());
}

function sumMillion() {
    var i, sum;
    var start = new Date().getMilliseconds();
    for (i = 0; i < 1000000; i++) {
        sum += i;
    }
    var end = new Date().getMilliseconds();
    var diff = end - start;
    alert("start : " + start + "ms \n end : " + end + "ms \n diff : " + diff + "ms");
}

function charBig() {
    var text = document.getElementById("charText").value;
    text = text.replace(/^./, text[0].toUpperCase());
    alert(text);
}

function monthStr() {
    var month = new Date().getMonth() + 1;
    var season;
    switch (month) {
        case 1:
        case 2:
        case 12:
            season = "겨울";
            break;
        case 3:
        case 4:
        case 5:
            season = "봄";
            break;
        case 6:
        case 7:
        case 8:
            season = "여름";
            break;
        case 9:
        case 10:
        case 11:
            season = "가을";
            break;
    }
    alert("지금은 " + month + "월이고, " + season + " 입니다.");
}

function movie() {
    var movieArray = ["터미네이터", "트렌스포머"];
    movieArray.push("멘오브스틸");
    movieArray[movieArray.length - 2] = "스파이더맨";
    alert(movieArray.pop(movieArray[movieArray.length]));
}

function fruit() {
    var fruitArray = ["감", "딸기", "배", "귤", "망고", "파인애플", "오렌지",
        "자두", "체리", "모과", "살구", "포도", "낑깡", "오디", "참외"];

    var fruitStr = [];
    fruitStr.push(fruitArray[Math.floor(Math.random() * fruitArray.length)]);
    fruitStr.push(fruitArray[Math.floor(Math.random() * fruitArray.length)]);
    fruitStr.push(fruitArray[Math.floor(Math.random() * fruitArray.length)]);
    alert(fruitStr.toString());
    if (fruitStr[0] === fruitStr[1] && fruitStr[0] === fruitStr[2] && fruitStr[1] === fruitStr[2]) {
        alert("와아!!!! 오늘은 운수가 좋은 날이에요!!!!");
    } else if (fruitStr[0] === fruitStr[1] || fruitStr[0] === fruitStr[2] || fruitStr[1] === fruitStr[2]) {
        alert("오늘은 운수가 나쁘진 않아요!!!");
    } else {
        alert("항상 운이 좋지만은 않죠 :-)");
    }
}