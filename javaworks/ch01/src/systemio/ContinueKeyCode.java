package systemio;

import java.io.IOException;

public class ContinueKeyCode {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode : " + keyCode);
			if(keyCode == 113) {
				System.out.println("종료!");
				break;
			}
		}

	}

}
