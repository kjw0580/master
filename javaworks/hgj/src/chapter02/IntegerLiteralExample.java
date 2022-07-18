package chapter02;

public class IntegerLiteralExample {

	public static void main(String[] args) {
		int var1 = 0b1011; // 11 ||| 2진수               Ob**  **은 2의 배수  64,32,16,8,4,2,1 순서
		int var2 = 0206; // 134 ||| 8진수					8진수는 0으로 시작 0*** 206은 2x8의 2제곱 | 0x8의 1제곱 | 6x8의 0제곱 | 128|0|6 = 134
		int var3 = 365; // 365 ||| 10진수 				우리가 사용하는 일상숫자
		int var4 = 0xB3; // 179 ||| 16진수				16진수는 0x로 시작하고 8진수와 같은 방법으로 계산하지만 8의 제곱이아닌 16의 제곱
		
		System.out.println(var1 + " " + var2 +" " + var3 +" " + var4);
	}
}
