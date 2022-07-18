package decorator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		
		//BufferedReader 객체 생성
		try(FileReader fr = new FileReader("animal.txt"); BufferedReader br = new BufferedReader(fr)){
			
			//데이터 읽어오기(버퍼링 기능)
			String[] animal = null;
			while(true) {
				String data = br.readLine();
				if(data == null) break;
				animal = data.split(" ");
			}
			System.out.println(animal[0]);
			System.out.println("================");
			
			//랜덤 출력
			int rand = (int) (Math.random()*animal.length);
			System.out.println(animal[rand]);
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
