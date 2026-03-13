package JAVA_BASICS;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class SoftLinkIO {

	public static void main(String[] args) {
		Path existingFilePath = Paths.get("D:\\waveform\\track 1\\Exported");
//		Path symLinkpath = Paths.get("D:\\text_sample.text");
		
//		try {
//			Files.createSymbolicLink(symLinkpath, existingFilePath);
//		}
//		catch(IOException x){
//			System.err.println(x);
//		}
//		catch(UnsupportedOperationException x) {
//			System.err.println(x);
//		}
		
		Boolean result = Files.notExists(existingFilePath);
		System.out.println(result);

	}

}
