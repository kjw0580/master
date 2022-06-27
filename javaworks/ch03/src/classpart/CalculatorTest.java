package classpart;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator 사용
		Calculator calc = new Calculator();
		
		int num1 = 10, num2 = 20;
		
		int add = calc.add(num1, num2);
		int sub = calc.sub(num1, num2);
		int mul = calc.mul(num1, num2);
		int div = calc.div(num1, num2);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
	}
}