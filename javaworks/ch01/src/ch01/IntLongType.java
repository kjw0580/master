package ch01;

public class IntLongType {

	public static void main(String[] args) {
		// 정수 자료형
		//int 범위 : -21억 ~ 21억(총 개수 - 43억[32bit])
		int iNum = 1234567890;
		System.out.println(iNum);
		
		//long 범위 : 64bit, 숫자 뒤에 'L' or 'l'을 붙임
		long lNum = 123456789012L;
		System.out.println(lNum);
	}
}
