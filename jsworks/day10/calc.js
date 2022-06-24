// 덧셈 프로그램
let n1 = prompt("첫번째 수 입력 : ");
let n2 = prompt("두번째 수 입력 : ");
let sum_v = 0;

//연산
//입력받은 문자를 정수로 변환 parseInt()
// sum_v = n1 + n1;
sum_v = parseInt(n1) + parseInt(n2);

//출력
document.write("두 수의 합 : " + sum_v);