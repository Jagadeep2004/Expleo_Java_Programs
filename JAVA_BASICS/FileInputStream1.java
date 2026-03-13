package JAVA_BASICS;


import java.io.FileInputStream;
public class FileInputStream1 {

	public static void main(String[] args) {
		try {
			FileInputStream input = new FileInputStream("D:\\text_sample.txt");
			System.out.println("Data in the file : ");
			int i = input.read();
			while(i!=-1) {
				System.out.println((char)i);
				i=input.read();
			}
			input.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}