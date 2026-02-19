package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class DivisorOfSeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		if(n%7==0) {
			System.out.println("The number is divisor of 7");
		}
									// Using simple if
		sc.close();
	}

}
