package outputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		System.out.println("여러 개의 문자를 입력하고 [Enter]를 누르세요");
		
		int readByte;   //문자의 코드 값
		try {
			while((readByte = System.in.read()) != -1) {
				// -1은 읽은 문자가 없다는 의미
				System.out.print((char)readByte);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
