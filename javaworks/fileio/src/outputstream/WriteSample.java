package outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteSample {
	
	public static void main(String[] args) throws IOException {
		//OutputStream, FileOutputStream 클래스를 사용
		//데이터가 test1.db인 바이트 기반 파일 출력스트림 생성
		OutputStream os = new FileOutputStream("C:/File/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);  //파일에 쓰기
		os.write(b);
		os.write(c);
		os.write(40);
		
		os.flush(); //출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close();
	}
}
