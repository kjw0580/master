package writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {

	public static void main(String[] args) {
		//문자 파일 기반 출력스트림 생성
		try(Writer fw = new FileWriter("file2.txt")){
			fw.write("Hello~ 자바!\n");   //문자열 쓰기
			fw.write("만나서 반갑습니다.\n");
			//fw.write((int) 3.3);  //정수, 실수 쓰기 불가
			fw.write(50);  //아스키 코드(정수 아님) - 문자 쓰기
			fw.write(10);  //개행 문자(줄바꿈)
			//배열 쓰기
			char[] buf = {'a', 'p', 'p', 'l', 'e'};
			fw.write(buf);
			fw.write(10);
			fw.write(buf, 0, 2);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("수행 완료!");
	}

}
