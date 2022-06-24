package operator;

public class Operator3 {

	public static void main(String[] args) {
		// 비교 연산자
		System.out.println(7 < 4);
		System.out.println(7 >= 4);
		System.out.println(7 == 4);
		System.out.println(7 != 4);
		
		//논리 연산자
		System.out.println((7 > 4) && (7 == 4));
		System.out.println((7 > 4) || (7 == 4)); //단락 회로
		System.out.println(!(7 > 4)); //논리부정
		System.out.println("========================");
		
		//단락 회로 예제
		//&&(논리곱) 인 경우 - 앞 조건이 거짓이면 뒤 조건은 연산하지 않음
		//||(논리합) 인 경우 - 앞 조건이 참이면 뒤 조건은 연산하지 않음
		int n = 10, i = 2;
		boolean x = ((n = n + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(x);  //false  
		System.out.println(n);  //20
		System.out.println(i);  //2
		
		boolean y = ((n = n + 10) > 10) || ((i = i + 2) < 10);
		System.out.println(y);  //true  
		System.out.println(n);  //30
		System.out.println(i);  //2
	}
}
