package JAVA_BASICS;

import java.util.Scanner;

public class JenkinsSampleProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name =sc.nextLine();
		
		System.out.println("Enter age :");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println(name+" is eligible to vote");
		}
		else {
			System.out.println(name+" is not eligible to vote");
		}
		
		
		

	}

}
