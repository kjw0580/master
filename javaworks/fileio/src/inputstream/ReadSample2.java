package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadSample2 {

	public static void main(String[] args) {
		
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/File/test2.db");
			
			//100개 크기의 배열 생성
			byte[] buffer = new byte[100];
			
			int data;
			while((data = is.read(buffer)) != -1) {
				for(int i = 0; i < data; i++) {  //읽은 수만큼 출력
					System.out.println(buffer[i]);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
