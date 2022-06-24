var num1 = Number(prompt("학점을 적어주세요", "100"));
var grade = "";
if(num1 < 60){
    grade = "F";
}else if(num1 < 70){
    grade = "D";
}else if(num1 < 80){
    grade = "C";
}else if(num1 < 90){
    grade = "B";
}else if(num1 >= 90){
    grade = "A";
}
//else if 조건이 아래가 참이면 값이 변경됨
document.write("학점은 <span>" + grade + "</span>입니다.");