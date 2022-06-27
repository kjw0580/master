package seats;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		//자리배치도 프로그램
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
		
		//좌석 배치(반복)
		for(int i = 0; i < rowNum; i++) {//행
			for(int j = 1; j <= colNum; j++) {
				int seatNum = i * colNum + j;
				if(seatNum > member)
					break;
				System.out.print(seatNum + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
