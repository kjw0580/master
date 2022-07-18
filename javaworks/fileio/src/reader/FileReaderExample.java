package reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		//문자 파일 기반 입력스트림 생성
		try(Reader fr = new FileReader("file2.txt")){
			/*int i;
			while((i = fr.read()) != -1) { //파일의 끝에 도달할때까지
				System.out.print((char)i);*/
			while(true) {
				int data = fr.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
