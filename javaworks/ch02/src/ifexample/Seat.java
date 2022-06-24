package ifexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		//입장객 수와 좌석 열수에 따른 줄(행)수 계산하기
		//나누어 떨어지는경유, 나머지가 있는경우
		Scanner scan = new Scanner(System.in);
		System.out.println("입장객 수 : ");
		int member = scan.nextInt();
		System.out.println("좌석 열 수 : ");
		int colNum = scan.nextInt();
		int rowNum = 0;
		int otherSeat = 0;
		
		//연산
		rowNum = member / colNum;
		otherSeat = member % colNum;
		
		if(otherSeat == 0) {
			System.out.println(colNum + "개의 열과");
			System.out.println(rowNum + "개의 행이 필요합니다");
		}else {
			System.out.println(colNum + "개의 열과");
			System.out.println((rowNum+1) + "개의 행이 필요합니다");
			System.out.println(otherSeat + "명이" + "끝행에 앉습니다");
		}
		System.out.println("====================");
		//연산2
		if(member % colNum ==0) {
			rowNum = member / colNum;
		}else { //member % colNum !=0
			rowNum = (member / colNum) + 1;
		}
		for(int i = 0; i < rowNum; i++) {
			for(int j = 1; j <= colNum; j++) {
				int seatNum = i * colNum +j;
				if(seatNum > member)
					break;
				System.out.println(seatNum + " ");
			}
			System.out.println();
		}
	}//메인닫기
	
}//클래스 닫기
