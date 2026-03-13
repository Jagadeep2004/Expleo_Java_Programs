package JAVA_BASICS;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
public class PathMethods {

	public static void main(String[] args) {
		Path p1 = Paths.get("\\Persoal\\Training\\Example\\..\\abc\\Test.text");
		Path normalizePath = p1.normalize();
		Path subPath = p1.subpath(0, 5);
		Path p2 = Paths.get("F:\\Persoal\\Training\\Example\\..\\abc\\Test.text");
		
		System.out.println("Normalize path : "+normalizePath);
		System.out.println("Sub path : "+subPath);
		System.out.println("get file Name : "+p1.getFileName());
		System.out.println("get parent : "+p1.getParent());
		System.out.println("get name count : "+p1.getNameCount());
		System.out.println("get root : "+p1.getRoot());
		System.out.println("is absolute : "+p1.isAbsolute());
		System.out.println("to absolute path : "+p1.toAbsolutePath());
		System.out.println("to uri : "+p1.toUri());
		
		if(p1.equals(p2)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not equal");
		}
	}

}
