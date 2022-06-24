package ifexample;

import java.util.Scanner;

public class CompareEx {

	public static void main(String[] args) {
		// 조건문과 조건 연산자
		Scanner sc= new Scanner(System.in);
		System.out.print("첫째수 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("둘째수 입력 : ");
		int n2 = sc.nextInt();
		
		//int n1 = 4, n2 = 5;
		int max;
		
		//두 수의 비교(조건 연산자)
		//max = (n1 > n2) ? n1 : n2;
		
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		System.out.println("큰 수는 " + max + "입니다.");
		sc.close();
	}
}
