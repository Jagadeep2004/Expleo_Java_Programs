package JAVA_BASICS;
import java.util.*;
public class IfElseIfConditionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Types of seats available:\n1.EXECUTIVE\n2.PREMIUM\n3.REGULAR");
		System.out.println("Enter your type : ");
		String type = sc.next();
		if(type.equals("EXECUTIVE")) {
			System.out.print("Cost is 100");
		}
		if(type.equals("PREMIUM")) {
			System.out.print("Cost is 70");
		}
		if(type.equals("REGULAR")) {
			System.out.print("Cost is 50");
		}
		sc.close();
	}

}
