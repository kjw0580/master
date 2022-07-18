package decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		
		try(FileInputStream fis = new FileInputStream("data.txt"); DataInputStream dis = new DataInputStream(fis)){
			
			//데이터 쓰기
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
