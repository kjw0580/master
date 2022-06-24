package scannerEx;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// 입력 작업
		Scanner scan = new Scanner(System.in);
		
		//문자열 입력
		System.out.print("당신의 이름은 무엇입니까? ");
		String name = scan.nextLine();  //이름 입력
		
		System.out.println("이름 : " + name);
		
		//숫자 입력
		System.out.print("나이는 몇 살이세요? ");
		int age = scan.nextInt();  //나이 입력
		
		System.out.println("나이 : " + age);
		scan.close();
	}
}
