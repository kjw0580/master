package chapter02.exam;

import java.util.Scanner;

public class exam2_4_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수:");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째 수:");
		String strNum2 = scanner.nextLine();
		
		int num1 = (int)Double.parseDouble(strNum1);
		int num2 = (int)Double.parseDouble(strNum2);	
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
	}

}
