package type;

public class TypeConversion2 {

	public static void main(String[] args) {
		// 사칙 연산
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);   //기본적으로 int형으로 계산
		
		System.out.println((double)x / y);  //double로 자동 형변환됨

	}

}
