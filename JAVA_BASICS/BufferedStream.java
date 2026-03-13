package JAVA_BASICS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStream {

	public static void main(String[] args) {
		try(BufferedReader bi = new BufferedReader(new FileReader("text_sample_1.txt"));
				BufferedWriter bo =new BufferedWriter(new FileWriter("text_sample_2.txt"))){
					String line="";
					while((line=bi.readLine())!=null) {
						bo.write(line);
						bo.newLine();
					}
				}
				catch(FileNotFoundException e) {
					System.out.println(e);
				}
				catch(IOException e) {
					System.out.println(e);
				}

	}

}
