package JAVA_BASICS;
import java.util.*;
public class IfConditionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isAvailable=true;
		System.out.print("Enter Seat Number : ");
		int seatNumber = sc.nextInt();
		if(isAvailable) {
			System.out.print(seatNumber);
		}
		sc.close();
	}

}
