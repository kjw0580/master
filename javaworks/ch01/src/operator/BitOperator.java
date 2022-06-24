package operator;

public class BitOperator {

	public static void main(String[] args) {
		// 비트 논리 연산
		int num1 = 5;   //00000101
		int num2 = 10;  //00001010
		int result;
		result = num1 & num2;  //00000000 (모두 1일때만 1, 아니면 0)
		System.out.println(result); //정수 0
		
		result = num1 | num2; //00001111 (둘 중 하나만 1이어도 1)
		System.out.println(result); //정수 15
	
		// 비트 이동 연산
		int val = 2;  //00000010   
		System.out.println(val << 1); //왼쪽으로 1자리 이동(00000100), 정수 4
		System.out.println(val >> 1); //오른쪽으로 1자리 이동(00000001), 정수 1
		
		//2진수, 16진수 표기
		int n = 10;
		int bNum = 0b1010; //0b를 앞에 붙이면 2진수 표기
		int hNum = 0xA;    //0x를 앞에 붙이면 16진수
		
		System.out.println(n);
		System.out.println(bNum);
		System.out.println(hNum);
	}

}
