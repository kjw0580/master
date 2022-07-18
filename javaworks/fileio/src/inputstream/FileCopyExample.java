package inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample {

	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기 - 복사하기
		String originFile = "C:/File/bg0.jpg";
		String copyFile = "C:/File/bg1.jpg";
		
		FileInputStream fis = null;   //입력 스트림 객체 선언
		FileOutputStream fos = null;  //출력 스트림 객체 선언
		
		try {
			fis = new FileInputStream(originFile);
			fos = new FileOutputStream(copyFile);
			
			//파일 읽기
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
