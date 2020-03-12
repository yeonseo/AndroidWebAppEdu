$(function () {
    var container = $('.slideshow'),
        slideGroup = container.find('.slideshow_slides'),
        slides = slideGroup.find('a'),
        nav = container.find('.slideshow_nav'),
        indicator = container.find('.indicator'),
        slideCount = slides.length,
        indicatorHtml = '',
        currentIndex = 0,  //현재슬라이드 저장
        duration = 1000,    //지연시간 0.5초
        easing = 'easeInOutExpo',
        interval = 3500,
        timer;

    //슬라이드를 가로로 배
    //slides 마다 배열 :left 0% 100% 200% 300%
    console.log(slides);


    /**
     * jQuery를 사용해 배열을 관리하고자 할 때 each() 메서드를 사용할 수 있습니다.
     * each() 메서드는 매개 변수로 받은 것을 사용해 for in 반복문과 같이 배열이나 
     * 객체의 요소를 검사할 수 있는 메서드입니다.
     * 출처: https://webclub.tistory.com/455 [Web Club]
    */
    slides.each(function (i) {
        var newLeft = i * 100 + '%';
        $(this).css({ left: newLeft });
        indicatorHtml += '<a href="">' + (i + 1) + '</a>';
    });

    //.html()은 선택한 요소 안의 내용을 가져오거나, 다른 내용으로 바꿉니다. .text()와 비슷하지만 태그의 처리가 다릅니다.
    indicator.html(indicatorHtml);

    //슬라이드 이동함수
    function gotoSlide(index) {
        slideGroup.animate({ left: -100 * index + '%' }, duration, easing);
        currentIndex = index;
        updateNav();  //처음인지, 마지막인지 검사
    }

    function updateNav() {
        var navPrev = nav.find('.prev');
        var navNext = nav.find('.next');
        if (currentIndex == 0)
            navPrev.addClass('disabled');
        else
            navPrev.removeClass('disabled');

        if (currentIndex == slideCount - 1)
            navNext.addClass('disabled');
        else
            navNext.removeClass('disabled');

        indicator.find('a').removeClass('active');
        indicator.find('a').eq(currentIndex).addClass('active');
        //indicator.find('a').eq(currentIndex).addClass('active').siblings().removeClass('active');
    }

    //인디케이터로 이동하기
    indicator.find('a').click(function (e) {
        e.preventDefault();  //a tag 기본기능막기
        var idx = $(this).index();
        gotoSlide(idx);

    });


    //좌우버튼으로 이동하기
    nav.find('.prev').click(function (e) {
        e.preventDefault();  //a tag 기본기능막기
        if (currentIndex !== 0) {
            currentIndex -= 1;
        } else if (currentIndex === 0) {
            currentIndex = slideCount - 1;
        }
        gotoSlide(currentIndex);
    });

    nav.find('.next').click(function (e) {
        e.preventDefault();  //a tag 기본기능막기
        if (currentIndex !== slideCount - 1) {
            currentIndex += 1;
        } else if (currentIndex === slideCount - 1) {
            currentIndex = 0;
        }
        gotoSlide(currentIndex);
    });

    updateNav();

    //자동슬라이드 함수
    function startTimer() {
        timer = setInterval(function () {
            var nextIndex = (currentIndex + 1) % slideCount;
            gotoSlide(nextIndex);
        }, interval);
    }

    startTimer();

    function stopTimer() {
        clearInterval(timer);
    }

    container.mouseenter(function () {
        stopTimer();
    });

    container.mouseleave(function () {
        startTimer();
    });

});