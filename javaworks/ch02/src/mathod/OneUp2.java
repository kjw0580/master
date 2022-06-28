package mathod;

public class OneUp2 {
	
	static int x = 1;  //전역 변수(프로그램이 종료될 때 소멸)
	
	//1을 더하는 함수
	public static int oneUp() {
		x = x + 1;
		return x;
		
	}

	public static void main(String[] args) {
		
		//호출
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //3
		System.out.println(oneUp()); //4
	}

}
