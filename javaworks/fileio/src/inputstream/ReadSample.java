package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//데이터가 test1.db인 바이트 기반 파일 입력 스트림 생성
		InputStream is = new FileInputStream("C:/File/test1.db");
		
		//파일 내용 읽기
		/*int readByte;
		while((readByte = is.read()) != -1) { //1바이트 씩 읽어 파일 끝에 도달하면
			System.out.println(readByte);
		}*/
		
		while(true) {
			int readByte = is.read();
			if(readByte == -1) break;
			System.out.println(readByte);
		}
		
		is.close();

	}

}
