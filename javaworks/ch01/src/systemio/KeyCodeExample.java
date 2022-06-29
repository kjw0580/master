package systemio;

import java.io.IOException;

public class KeyCodeExample {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		System.out.println("한 개의 문자를 입력하세요");
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode : " + keyCode);
		
	}
}
