package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		// km를 mile로 변환
		final double RATE_KPH_MPH = 1.609344; //상수
		double kph = 0.0;
		double mph = 0.0;
		
		//입력 
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 구속을 입력하세요(kph) ");
		kph = sc.nextDouble();  //km 입력
		
		//연산 : mph = kph / 상수
		mph = kph / RATE_KPH_MPH;
		
		//System.out.println(mph);
		//printf("문자열 포맷", 객체(변수))
		//서식 문자(정수 - %d, 실수 - %f)
		System.out.printf("공의 속도는 %.2f[MPH]입니다.", mph);
		
		sc.close();  //입력 종료
	}
}
