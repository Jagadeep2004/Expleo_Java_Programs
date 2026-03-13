package JAVA_BASICS;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String data = "Hello everyone";
		try {
			FileOutputStream output = new FileOutputStream("D:\\text_sample");
			byte[] arr = data.getBytes();
			output.write(arr);
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
