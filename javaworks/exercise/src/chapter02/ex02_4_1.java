package chapter02;

import java.util.Scanner;

public class ex02_4_1 {

	public static void main(String[] args) {
		//1
		String name= "감자바";
		int age =25;
		String tel1="010", tel2="123", tel3="4567";
		System.out.println("이름 : " + name);
		System.out.print("나이 : " + age);
		System.out.printf("\n전화 : " + "%s-%s-%s \n", tel1, tel2, tel3);
	
		
		//2
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수");
		String strNum1 = scanner.nextLine();
		
		System.out.println("두번째 수");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈결과 : " + result);
		
		//3
		String Id;
		String adress;
		String phone;
		
		System.out.println("이름을 입력하세요");
		Id = scanner.nextLine();
		System.out.println("주민번호를 입력하세요");
		adress = scanner.nextLine();
		System.out.println("전화번호를 입력하세요");
		phone = scanner.nextLine();
		
		System.out.println("\n\n[입력한 내용]");
		System.out.printf("\n%s\n%s\n%s\n", Id, adress, phone);
	}
}
