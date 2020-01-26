$(document).ready(function () {
    $("#button1").click(function () {
        $(".container").remove();
    });
});
$(document).ready(function () {
    $("#button2").click(function () {
        $(".container").empty();
    });
});


$(document).ready(function () {
    var pNode = $("p"), divNode = $("div.container");
    //$("div.container"); 객체를 생성하는 행위이다.
    //이 행위를 할 때 마다 퍼포먼스를 잡아먹는다.
    //var pNode 이렇게 변수를 선언하면, 객체를 한번만 생성하고
    //그 주소값을 가지고 사용하는 행위니까 퍼포먼스를 덜 먹는다.

    // $("p").css("background-color", "yellow");
    // $("div.container").css({
    //     "height": "80px",
    //     "width": "200px",
    //     "border": "1px dotted red"
    // });
    pNode.css("background-color", "yellow");
    divNode.css({
        "height": "80px",
        "width": "200px",
        "border": "1px dotted red"
    });
});

$(document).ready(function () {
    var $modWidth = 50;
    var $div = $("div.test2");
    $div.click(function () {
        if ($(this).hasClass('test2')) {
            $(this).width($modWidth);
            $(this).removeClass();
            $(this).addClass("next");
            $modWidth -= 8;
        } else {
            $(this).removeClass();
            $(this).addClass("test2");
            $modWidth += 8;
        }

    });
});



$(document).ready(function () {
    var bodyObj = $("body");
    bodyObj.append("<div id=\"subBodyDiv\"></div>");

    var subBodyObj = $("#subBodyDiv");
    subBodyObj.css({ "position": "relative", "clear": "both" });
    var barText = function () {
        subBodyObj.append("<div id=\"bar\">================================================</div>");
    };

    //cssEchoButton
    barText();
    subBodyObj.append("<div id=\"cssEchoDiv\"></div>");
    subBodyObj.append("<button id=\"cssEchoBtnElem\">css(Elem)</button>");
    subBodyObj.append("<button id=\"cssEchoBtnElemStyle\">css(Elem, Style)</button>");
    subBodyObj.append("<p id=\"cssEchoRes\">res</p>");

    var $cssEchoDivObj = $("div#cssEchoDiv");
    var $cssEchoElemBtnObj = $("#cssEchoBtnElem");
    var $cssEchoElemStyBtnObj = $("#cssEchoBtnElemStyle");
    var color = null;
    var res = $("p#cssEchoRes");
    $cssEchoElemBtnObj.click(function () {
        color = $cssEchoDivObj.css("background-color");
        res.text("background-color : " + color);
    });
    $cssEchoElemStyBtnObj.click(function () {
        $cssEchoDivObj.css("background-color", "red");
    });

    //divBorder
    barText();
    subBodyObj.append("<div id=\"borderDiv\"></div>");
    subBodyObj.append("<button id=\"borderTextBtn\">Border Warning</button>");

    var $borderDivObj = $("div#borderDiv");
    $borderDivObj.append("<p>Example</p>");

    var $borderTextObj = $("#borderText");
    var $borderTextBtnObj = $("#borderTextBtn");

    $borderTextBtnObj.click(function () {
        if ($borderDivObj.hasClass('warning')) {
            $borderDivObj.removeClass();
            $borderDivObj.addClass("borderDiv");
            $borderDivObj.css("background-color", "white");
        } else {
            $borderDivObj.removeClass();
            $borderDivObj.addClass("warning");
            $borderDivObj.css("background-color", "yellow");
        }
    });
    $cssEchoElemStyBtnObj.click(function () {
        $cssEchoDivObj.css("background-color", "red");
    });


    //Example 1
    barText();
    subBodyObj.append("<div id=\"exampleOneDiv\"></div>");
    subBodyObj.append("<button id=\"exampleOneVisBtn\">Visible</button>");
    subBodyObj.append("<button id=\"exampleOneHidBtn\">Hidden</button>");

    var $exampleOneDivObj = $("div#exampleOneDiv");
    var $exampleOneVisBtnObj = $("#exampleOneVisBtn");
    var $exampleOneHidBtnObj = $("#exampleOneHidBtn");

    $exampleOneVisBtnObj.click(function () {
        if ($borderDivObj.css("visibility") === "hidden") {
            $borderDivObj.css("visibility", "visible");
        } else {
            $borderDivObj.css("visibility", "hidden");
        }
    });
    $exampleOneHidBtnObj.click(function () {
        if ($borderDivObj.css("visibility") === "visible") {
            $borderDivObj.css("visibility", "hidden");
        } else {
            $borderDivObj.css("visibility", "visible");
        }
    });

    //Example 2
    barText();
    subBodyObj.append("<div id=\"exampleTwoDiv\"></div>");
    subBodyObj.append("<input type=\"text\" id=\"exampleTwoText\"></input><br />");
    subBodyObj.append("<p id=\"exampleTwoTextP\">text</p>");

    var $exampleTwoDivObj = $("div#exampleTwoDiv");
    var $exampleTwoTextObj = $("#exampleTwoText");
    var $exampleTwoTextPObj = $("#exampleTwoTextP");

    $exampleTwoTextObj.keyup(function () {
        var textInput = $exampleTwoTextObj.val();
        $exampleTwoTextPObj.text(textInput);
    });

    //Example 3
    barText();
    subBodyObj.append("<div id=\"exampleThreeDiv\"></div>");
    subBodyObj.append("<button id=\"exampleThreeBtnL\">L</button>");
    subBodyObj.append("<button id=\"exampleThreeBtnR\">R</button>");
    subBodyObj.append("<button id=\"exampleThreeBtnB\">Big</button>");

    var $exampleThreeDivObj = $("div#exampleThreeDiv");
    var $exampleThreeBtnRObj = $("#exampleThreeBtnR");
    var $exampleThreeBtnLObj = $("#exampleThreeBtnL");
    var $exampleThreeBtnBObj = $("#exampleThreeBtnB");

    $exampleThreeDivObj.css({
        "position": "relative",
        "background-color": "orange",
        "width": "90px",
        "height": "90px",
        "left": "50px",
        "top": "450px"

    });
    $exampleThreeBtnRObj.click(function () {
        $exampleThreeDivObj.animate({ "left": "+=50px" }, "slow");
    });

    $exampleThreeBtnLObj.click(function () {
        $exampleThreeDivObj.animate({ "left": "-=50px" }, "slow");
    });

    //Example 4
    barText();
    $exampleThreeBtnBObj.click(function () {
        $exampleThreeDivObj.css({ "width": "+=10px", "height": "+=10px" });
    });


    //Example test
    barText();
    var data = {
        "member": [{ "no": "1", "name": "hh" }, { "no": "2", "name": "kk" }]
    };

    subBodyObj.append("<table id=\"textTableT\"></table>");
    var $tableMain = $("#textTableT");
    subBodyObj.append("<input id=\"textInputName\"></input>");
    subBodyObj.append("<button id=\"textTableBtn\">Add</button>");
    var $textInputNameObj = $("#textInputName");
    var $textTableBtnObj = $("#textTableBtn");
    var makeRow = function () {
        $tableMain.append("<tr><td id=\"textTableNo\">No</td>"
            + "<td id=\"textTableName\">Name</td></tr>");
    };
    var inputValRow = function () {
        $("td#textTableNo:last").text(data.member[i].no);
        $("td#textTableName:last").text(data.member[i].name);
    };

    makeRow();
    $("td#textTableNo:last").css({ "background-color": "lightGray", "width": "30px" });
    $("td#textTableName:last").css({ "background-color": "lightGray", "width": "100px" });

    var i = 0;
    for (i = 0; i < data.member.length; i++) {
        makeRow();
        inputValRow();
    };

    $textTableBtnObj.click(function () {
        makeRow();
        data.member.push($textInputNameObj.val());
        $("td#textTableNo:last").text(data.member.length);
        $("td#textTableName:last").text($textInputNameObj.val());
    });
});