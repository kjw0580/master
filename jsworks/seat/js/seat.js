//자리 배치도 
let customNum = Number(prompt("입장객은 몇 명인가요?"));
let colNum = Number(prompt("한줄에 몇명이 앉을까요?")); //열수
let rowNum = 0;

//입장객 수에 따른 행과 열 계산
// 조건 - 나누어 떨어질때, 나머지가 있을때
if(customNum % colNum == 0){
    rowNum = customNum / colNum
}else{
    rowNum = parseInt(customNum / colNum) + 1;
}

document.write("<table>")
for(let i = 0; i < rowNum; i++){
    document.write("<tr>")
    for(let j = 1; j <= colNum; j++){
        let seatNum = i * colNum + j;
        document.write("<td>좌석" + seatNum + "</td>");
        if(seatNum == customNum){
            break;
        }
    }
    document.write("</tr>")
}
document.write("</table>")









/* rowNum = customNum % colNum;
document.write(rowNum); */