package JAVA_BASICS;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class ByteIOStreamExample2 {

	public static void main(String[] args) {
		char[] b = new char[128];
		try(FileReader fr = new FileReader("text_sample_1.txt");
				FileWriter fw = new FileWriter("text_sample_2.txt") ) {
		
					
					int count = 0,read =0;
					while((read = fr.read(b))!=-1) {
						fw.write(b);
						count+=read;
					}
					System.out.println("Total count : "+count);
					String str = new String(b);
					System.out.println(str);
					
		}
		catch(FileNotFoundException f) {
			System.out.println(f);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}

