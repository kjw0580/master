package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample3 {

	public static void main(String[] args) {
		//close()를 사용하지 않는 try ~ with문
		//바이트 기반 파일 입력스트림 생성
		try(InputStream is = new FileInputStream("C://File/test3.db")){
			
			byte[] buffer = new byte[5];
			
			while(true) {
				int date = is.read(buffer, 2, 3);
				if(date == -1) break;
				for(int i=0; i<buffer.length; i++) {
					System.out.println(buffer[i]);
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
