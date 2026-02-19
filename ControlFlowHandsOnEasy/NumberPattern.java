package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();					// Getting integer input
		
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j <= i;j++) {			
				System.out.print(i+" ");		// Printing i in the inner loop
			}
			System.out.println();
		}
		sc.close();
	}

}
