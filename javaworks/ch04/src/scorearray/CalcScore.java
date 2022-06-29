package scorearray;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
				try	{System.out.println("-----------------------------------------------");
						System.out.println("1.학생수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
						System.out.println("-----------------------------------------------");
						System.out.print("선택 >");
						
						int selectNo = Integer.parseInt(scan.nextLine()); //문자를 정수로 변환
						
						if(selectNo == 1) {
							System.out.print("학생수>");
							studentNum = Integer.parseInt(scan.nextLine());
							scores = new int[studentNum]; //학생수 만큼 점수 배열의 크기 선언 array[] = new array[학생수]
						}else if(selectNo == 2){
							for(int i = 0; i < scores.length; i++) {
								System.out.println("scores[" + i + "]>");
								scores[i] = Integer.parseInt(scan.nextLine()); //점수 입력
							}
						}else if(selectNo == 3) {
								for(int sl : scores) {
									System.out.println(sl);
								}
						}else if(selectNo == 4) {
							int sumV = 0;
							double avgV = 0.0;
							
							//총점
							for(int i = 0; i < scores.length; i++) {
								sumV += scores[i];
							}
							System.out.println(sumV);
							avgV = (double)sumV/scores.length;
							System.out.println("평균 점수 : %.2f" + avgV);
						}
						else if(selectNo == 5) {
							run = false;
						}else {
							System.out.println("지원되지 않는 기능입니다. 다시 선택하세요!");
						}
					}//try끝
					catch(Exception e) {
					System.out.println("올바르게 선택해 주세요");
					}
			}//while 끝
		
		System.out.println("프로그램 종료!!");
		

	}//main 끝

}
