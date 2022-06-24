package constant;

public class Constant {

	public static void main(String[] args) {
		// 상수 - 변하지 않는 값(1년 12개월, 원주율 3.14)
		//final 키워드를 맨 앞에 붙임, 대문자로 표기
		final int MONTH = 12;
		final int MAX_NUM = 100;
		final int MIN_NUM = 1; 
		
		//MONTH = 6; 상수이므로 변경할 수 없음
		//MAX_NUM = 1000;
		
		System.out.println(MONTH);
		System.out.println(MAX_NUM);
		
		//원의 넓이 계산하기
		//area = radius * radius * PI
		final double PI = 3.14;  //상수
		int radius = 5;
		double area = 0.0;
		
		//연산 처리
		area = radius * radius * PI;
		
		System.out.println("원의 넓이는 " + area + "입니다.");
		
	}

}
