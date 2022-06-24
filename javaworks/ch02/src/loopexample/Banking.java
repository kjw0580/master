package loopexample;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		int money;
		
		while(run) {
			//화면 만들기(ui)
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			System.out.println("선택>");
			
			String selNum = sc.next();
			switch(selNum) {
			case "1": System.out.print("예금액>");
			money = sc.nextInt();
			if(money < 0) {
				System.out.println("잔액이 부족합니다. 다시 입력하세요");
			}else if(money < 0) {
				System.out.println("음수는 입력할 수 없습니다. 다시입력하세요");
			}
			balance += money;
			System.out.printf("%d원 정상처리 되었습니다.\n", money);
			break;
			
			case "2":
			while(true) {
				System.out.print("출금액>");
				money = sc.nextInt();
				if(money > balance) {
					System.out.println("잔액이 부족합니다. 다시 입력하세요");
				}else if(money < 0) {
					System.out.println("음수는 입력할 수 없습니다. 다시입력하세요");
				}else {
				balance -= money;
				System.out.printf("%,d원 정상처리 되었습니다.\n", money);
				}
				break;
			}

			case "3":
			System.out.printf("잔고 > %,d", balance);; break;
			
			case "4": run = false; break;
			}
		}
	}
}
