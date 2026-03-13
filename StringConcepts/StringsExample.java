
package StringConcepts;
import java.lang.*;
public class StringsExample {
	
	public static String concat1(String s1) {
		s1=s1.concat(" K C");
		return s1;
	}
	
	public static void concat2(StringBuilder s2) {
		s2.append(" Kumar");
	}

	public static void concat3(StringBuffer s3) {
		s3.append(" Hamiltom");
	}
	public static void main(String[] args) {
		String s1 = "Jagadeep";
		s1=concat1(s1);
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("Ajith");
		concat2(s2);
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("Lewis");
		concat3(s3);
		System.out.println(s3);
	}

}
