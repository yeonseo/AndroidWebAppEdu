function sub() {
    var name = document.getElementById("name");
    name.value = name.value.toLowerCase();
}

function onMouseOver(divElement) {
    divElement.style.border = "10px dotted red";
}
function onMouseOut(divElement) {
    divElement.style.border = "10px dotted blue";
}

function process() {
    var input = document.getElementById("target").value;
    // var input = document.myForm.text1.value;
    alert(input);
}

function changeLiColor() {
    var list = document.getElementsByTagName('ul')[0];
    var listItem = list.getElementsByTagName('li');

    for (var i = 0, length = listItem.length; i < length; i++) {
        alert(listItem[i].firstChild.data);
    }
}

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

function imageVis() {
    var imgSrc = document.getElementById("image").style.visibility;
    // alert(imgSrc);
    // alert(imgSrc == str);
    if (imgSrc === "hidden") {
        document.getElementById("image").style.visibility = "visible";
    } else {
        document.getElementById("image").style.visibility = "hidden";
    }
}

function addText() {
    if (document.createTextNode) {
        var text = document.createTextNode("여기는 보홀입니다.");
        document.getElementById("addTextDiv").appendChild(text);
    }
}
var windowTest;
function newWindow() {
    windowTest = window.open("https://github.com/yeonseo/AndroidWebAppEdu", "", "width=500", "height=500");
    windowTest.moveTo(0, 0);
}

function moveWindow() {
    windowTest.moveBy(10, 10);
    windowTest.focus();
}

function replaceWindow() {
    location.replace("https://github.com/yeonseo/AndroidWebAppEdu");
}

var id;
function backgroundColor() {
    id = setInterval(flashText, 100);
    // var id;
    // function changeColor() {
    //     id = setInterval(flashText, 500);
    // }
    function flashText() {
        var elem = document.getElementById("backgroundColorDiv");
        elem.style.color = (elem.style.color == "white") ? "yellow" : "white";
        elem.style.backgroundColor =
            (elem.style.backgroundColor == "green") ? "black" : "green";

    }
    changeColor();
}
function stopTextColor() {
    clearInterval(id);
}

function changeColor(c) {
    document.getElementById("backDiv").style.backgroundColor = c;
}
