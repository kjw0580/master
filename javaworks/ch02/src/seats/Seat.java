package seats;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		//입장객 수와 좌석 열수에 따른 줄(행)수 계산하기
		//나누어 떨어지는 경우 / 나머지가 있는 경우
		Scanner scan = new Scanner(System.in);
		System.out.print("입장객 수 : ");
		int member = scan.nextInt();
		
		System.out.print("좌석 열 수 : ");
		int colNum = scan.nextInt();
		
		int rowNum = 0;  //줄 수
		
		//연산
		if(member % colNum == 0) {
			rowNum = member / colNum;
		}else { //member % colNum != 0
			rowNum = (member / colNum) + 1;
		}
		
		//출력
		System.out.println(rowNum + "개의 줄이 필요합니다.");
		scan.close();
	}//main 닫기
}//class 닫기
