function showText(){
//텍스트 숨기기
let text = document.getElementById('detail')
text.style.display = "block";
/* document.getElementById('detail').style.display="block"; 함수선언없이 한줄로 작성 가능 */

// 보기버튼 숨기기
let button = document.getElementById('show')
button.style.display = "none";
}



function hideText(){
//텍스트 숨기기
let text = document.getElementById('detail')
text.style.display = "none";

//보기 버튼 보이기
let button = document.getElementById('show')
button.style.display = "block";
}