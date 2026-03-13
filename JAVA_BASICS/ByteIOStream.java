package JAVA_BASICS;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteIOStream {

	public static void main(String[] args) {
		byte[] b = new byte[128];
		try(FileInputStream fis = new FileInputStream("text_sample_1");
				FileOutputStream fos = new FileOutputStream("text_sample_2.txt") ) {
		
					System.out.println("Available bytes");
					int count = 0,read =0;
					while((read = fis.read(b))!=-1) {
						fos.write(b);
						count+=read;
					}
					System.out.println("Total count : "+count);
					
		}
		catch(FileNotFoundException f) {
			System.out.println(f);
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
