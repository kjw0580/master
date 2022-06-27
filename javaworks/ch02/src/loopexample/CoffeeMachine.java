package loopexample;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		//커피 자동판매기
		Scanner sc = new Scanner(System.in);
		int coffee = 5;   //커피 총 수량
		while(true) {
			System.out.print("돈을 넣어주세요: ");
			int money = sc.nextInt();  //머니 입력
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee -= 1; //커피 개수 1감소
			}
			else if(money > 500) {
				//System.out.println("거스름돈 " + (money - 500) + "원을 돌려주고 커피가 나옵니다.");
				System.out.printf("거스름돈 %d원을 돌려주고 커피가 나옵니다.", (money - 500));
				coffee -= 1;
			}
			else {//money < 500
				System.out.println("돈을 돌려주고 커피는 나오지 않습니다.");
			}
			System.out.println("남은 커피의 양은 " + coffee + "개입니다.");
			
			//커피의 개수가 0이면 "판매 중지"
			if(coffee == 0) {
				System.out.println("커피가 다 떨어졌습니다. 판매를 중지 합니다.");
				break;
			}
		}
		sc.close();
	}

}
