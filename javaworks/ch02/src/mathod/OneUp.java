package mathod;

public class OneUp {
	
	//1을 더하는 함수
	public static int oneUp(int x) {
		x = x + 1;  //지역변수(호출된 후 소멸)
		return x;
		
	}

	public static void main(String[] args) {
		
		//호출
		System.out.println(oneUp(1)); //2
		System.out.println(oneUp(1)); //2
		System.out.println(oneUp(1)); //2
	}

}
