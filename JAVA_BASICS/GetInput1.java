package JAVA_BASICS;
import java.util.Scanner;
public class GetInput1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
																// Getting input from user
		System.out.println("Enter your department : ");			// Understanding next() & nextLine() method
		String dept = sc.next();
		
		System.out.println("Hi "+name+" are u from "+dept);
		sc.close();
	}

}
