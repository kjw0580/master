package decorator.bufferedstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		
		try(FileWriter fw= new FileWriter("animal.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("cat");
			bw.write(32);
			bw.write("dog");
			bw.write(32);
			bw.write("chicken");
			bw.write(32);
			bw.write("tiger");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
