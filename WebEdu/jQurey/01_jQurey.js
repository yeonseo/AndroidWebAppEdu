$(document).ready(function () {
    $("input").focus(function () {
        $(this).css("background", "yellow");
    });

    $("input").blur(function () {
        $(this).css("background", "white");
    });

    $("button.show").click(function () {
        $("#dog").show("slow");
    });
    $("button.hide").click(function () {
        $("#dog").hide("slow");
    });
    $("button.slideUp").click(function () {
        $("#dog").slideUp(3000);
    });
    $("button.slideDown").click(function () {
        $("#dog").slideDown(3000);
    });
    $("button.animate").click(function () {
        $("#dog").animate({ left: '100px', top: '50px' });
    });
    $("button.fadeIn").click(function () {
        $("#dog").fadeIn(3000);
    });
    $("button.fadeOut").click(function () {
        $("#dog").fadeOut(3000);
    });
});

$(document).mouseover(function (e) {
    $("#log").html("e.pageX : " + e.pageX + "e.pageY : " + e.pageY);
    console.dir(e);
});