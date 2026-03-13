package JAVA_BASICS;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileSystem;
public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p1 = Paths.get("D:\\World_Cup\\Git\\src");
		Path p2 = p1.subpath(0, 2);
		
		System.out.println(p1);
		System.out.println(p2);
		

	}

}
