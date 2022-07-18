package chapter02;

public class ByteExample {

	public static void main(String[] args) {
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
	  //byte var6 = 128; //byte타입 오류 범위가 -128 ~ 127 까지이기에 128은 저장되는값의 허용범위를 초과하여 컴파일오류가 발생함
		
		System.out.println(var1 + " " + var2 + " " + var3 + " " + var4 + " " + var5);
		
	}

}
