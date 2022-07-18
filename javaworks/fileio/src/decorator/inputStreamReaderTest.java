package decorator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class inputStreamReaderTest {

	public static void main(String[] args) {
		//보조 스트림 객체(기반 스트림 객체) : 매개변수로 기반스트림 전달
		//바이트 기반 환경에서 문자 읽어오기
		try(InputStream fis = new FileInputStream("reader.txt");
			InputStreamReader isr = new InputStreamReader(fis)){
			
			while(true) {
				int data = isr.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
