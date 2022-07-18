package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		// 이미지 파일 복사 -읽고 쓰기
		//BufferedStream - 보조스트림 클래스 사용
		//버퍼링 기능 - 빠르게 입출력 가능
		//보조스트림은 단독으로 쓸수없고, 기반스트림과 함께 사용해야함
		long start = 0, end = 0;
		String originFile = "C:/File/bg0.jpg";
		String copyFile = "C:/File/bg_copy.jpg";

		//try with문 사용
		try(FileInputStream fis = new FileInputStream(originFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);){
			start = System.currentTimeMillis(); //복사전
			
			int i;
			while((i = bis.read()) != -1) {
				bos.write(i);
			}
			end = System.currentTimeMillis(); //복사후
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("소오 시간 = " + (end-start));
	}

}
