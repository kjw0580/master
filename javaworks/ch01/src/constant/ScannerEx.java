package constant;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//입력 작업
		//Scanner scan = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//문자열 입력
		System.out.print("당신의 이름은 무엇입니까?");
		String name = scanner.nextLine();
	}
}
