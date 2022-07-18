package chapter02.exam;

import java.util.Scanner;
public class exam2_4_3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("[필수 정보 입력]");
		System.out.println("1. 이름:");
		String name = scanner.nextLine();
		System.out.println("2. 주민번호 앞 6자리:");
		int ad = scanner.nextInt();
		System.out.println("3. 전화번호:");
		String tel = scanner.next();
		
		System.out.println("===========================");
		
		System.out.printf("[입력한 내용]\n%s\n%d\n%s", name, ad, tel);
		
	}

}
