package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class PrintHello {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		
		while(n >= 0) {
			
			for(int i = 0;i < n;i++) {
				System.out.println("Hello");
			}
			
			System.out.print("Enter the number : ");
			n = sc.nextInt();
		}
		sc.close();
	}

}
