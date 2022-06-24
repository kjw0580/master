//제목 애니메이션
let mainText = document.querySelector("h1")

window.addEventListener("scroll", function(){
    let value = this.window.scrollY; //마우스 스크롤 Y좌표 값
    console.log(value);

    if(value > 300){       //slideOut - 들어가기 || slideIn - 나타나기
        mainText.style.animation = "slideOut 1s ease-in forwards";
    } //forwards로 다시 나오지않게 설정
    else{
        mainText.style.animation = "slideIn 1s ease-out";
    }
})