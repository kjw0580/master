package writer;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		//File 클래스는 입,출력 기능은 없으나 파일 이름, 경로등을 알 수 있음
		File file = new File("C:/File/newFile.txt");
		file.createNewFile();

		System.out.println(file.isFile()); //파일인지 확인
		System.out.println(file.isDirectory()); //디렉토리인지 확인
		System.out.println(file.getName()); //파일이름확인
		System.out.println(file.getPath()); //파일경로확인
	}

}
