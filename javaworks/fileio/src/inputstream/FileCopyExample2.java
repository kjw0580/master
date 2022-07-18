package inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample2 {

	public static void main(String[] args) {
		//이미지 파일을 읽고 쓰기 - 복사하기
		//try ~ with ~ resource문
		//close()를 명시하지 않아도 됨
		long start = 0, end = 0;
		
		String originFile = "C:/File/bg0.jpg";
		String copyFile = "C:/File/bg2.jpg";
		
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile)){
			//이미지 읽고 쓰기
			start = System.currentTimeMillis(); //수행 전 현재 시간
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);  //파일 쓰기
			}
			end = System.currentTimeMillis();   //수행 후 현재시간
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일복사 소요시간: " + (end-start) + "ms");
	}

}
