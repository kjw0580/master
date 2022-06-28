package classpart;

public class CalculatorTest {

	public static void main(String[] args) {
		//Calculator 사용
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 20;
		
		//메서드 호출
		int add = calc.add(num1, num2);
		int sub = calc.sub(num1, num2);
		int mul = calc.mul(num1, num2);
		double div = calc.div(num1, num2);
		
		//출력
		System.out.println(add); 
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	}

}
