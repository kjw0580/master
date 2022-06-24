$(document).ready( function() {
	$('a.s_point').smoothScroll(); // smoothScroll을 사용하기 위해서는 아래에 있는 코드를 추가해야 함

	// 스크롤하여 내려와야 top버튼이 보이도록 함.
	if ( $(document).scrollTop() < 50) $('.to_top').addClass('hide'); // 스크롤이 50px 이하일 때 클래스 hide를 추가하기
	else $('.to_top').removeClass('hide'); // 스크롤이 50px 이상일 때 클래스 hide를 제거하기
	$(window).scroll( function() { // 스크롤이 발생할 때마다 아래에 있는 코드를 실행하기
	  if ( $(document).scrollTop() < 50) $('.to_top').addClass('hide'); // 스크롤이 50px 이하일 때 클래스 hide를 추가하기
	  else $('.to_top').removeClass('hide'); // 스크롤이 50px 이상일 때 클래스 hide를 제거하기
	});

	function myFunction(dad, son, before, after) {
		$('.' + dad).on(before,function() {
			$(`.${son}`).stop().stop().stop().fadeIn('fast');
		});
		$(`.${dad}`).on(after,function(){
			$(`.${son}`).stop().stop().stop().fadeOut('fast');
		});
		$(`.${son} li`).children().on(before,function() {
			$(`.${son}`).stop().stop().stop().fadeIn('fast');
		});
		$(`.${son} li`).children().on(after,function() {
			$(`.${son}`).stop().stop().stop().fadeOut('fast');
		});
	}

	let dad = ['openAll1','openAll2','openAll3','openAll4'];
	let son = ['gnb_depth2_1', 'gnb_depth2_2', 'gnb_depth2_3', 'gnb_depth2_4'];
	let effect = [['mouseover', 'mouseout'], ['focus', 'blur']];

	for(let i = 0; i < dad.length; i++) {
		for(let j = 0; j < effect[0].length; j++) {
			if (j == 0) {
				myFunction(dad[i], son[i], effect[j][j], effect[j][j+1]);
				console.log(dad[i], son[i], effect[j][j], effect[j][j+1]);
			}
			else if(j == 1) {
				myFunction(dad[i], son[i], effect[j][j-1], effect[j][j]);
				console.log(dad[i], son[i], effect[j][j-1], effect[j][j]);
			}
		}
	}
    
	//모바일 메뉴 띄움
	$('.openMOgnb').click(function(){ // openMOgnb를 클릭할 때
		$('header').addClass('on'); // header에 on을 추가한다
		$('header .header_cont').slideDown('"fast"'); // header_cont를 빠르게 슬라이드 내리기
		$('header .header_area .header_cont .closePop').show();			 // header_area의 header_cont의 closePop을 보이게 한다
		$("body").bind('touchmove', function(e){e.preventDefault()}); // body에 touchmove를 바인딩한다
	});
	$('header .header_cont .closePop').click(function(){ // closePop을 클릭할 때
        $('.header_cont').slideUp('"fast"'); // header_cont를 빠르게 슬라이드 올리기
        $('header').removeClass('on'); // header에 on을 제거한다
        $("body").unbind('touchmove'); // body에 touchmove를 언바인딩한다
	});
	
});

$(document).ready(function(){ // 문서가 준비되면 실행
    // PC브라우저에서 좁혀서 메뉴 닫고 다시 넓힐 때 상단메뉴 노출되게.
    $(window).resize(function() { // window의 resize를 실행할 때
        if ( parseInt($('header').css('width')) > 800 ) $('.header_cont').show(); // header의 width가 800px 이상일 때 header_cont를 보이게 하기
    }); 
    
    // 프로그램 소개 - 더보기/접기 작동
	$('.program_list li .btn_more a').click(function(){ // btn_more을 클릭할 때
		if ($(this).parent().parent().find('.subtxt').css('display') == 'none') { // subtxt의 display가 none일 때
			$(this).parent().parent().find('.subtxt').css('display','inline'); // subtxt의 display를 inline으로 변경한다
			$(this).text('접기'); // text를 접기로 변경한다
		} else {
			$(this).parent().parent().find('.subtxt').css('display','none'); // subtxt의 display를 none으로 변경한다
			$(this).text('더보기'); // text를 더보기로 변경한다
		}
	});
});