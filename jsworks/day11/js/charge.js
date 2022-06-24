var age = Number(prompt("나이를 적어주세요", "20"))
var charge = 0; //입장료

if(age < 8){
    document.write("미취학 아동입니다.<br>");
    charge = 1000;
}else if(age >= 8 && age < 14){
    document.write("초등학생 입니다.<br>");
    charge = 2000;
}else if(age >= 14 && age < 20){
    document.write("초등학생 입니다.<br>");
    charge = 2500;
}else if(age >= 20){
    document.write("일반인 입니다.<br>");
    charge = 3000;
}
document.write("입장료는 <span>" + charge + "원 " + "</span>입니다.")