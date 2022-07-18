package noriteo;

import java.util.Scanner;

public class sysInRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*Scanner scanner = new Scanner(System.in);
		String keyCode;

		while(true) {
			
			
			System.out.println(scanner.next());
			if(scanner.next().equals("1")) {
				System.out.println("숫자 1을 입력하셔서 프로그램을 종료합니다!");
				break;
			}
		}*/
		
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println(keyCode);
			if(keyCode == 49) {
				System.out.println("1을 입력하여 종료합니다!");
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
