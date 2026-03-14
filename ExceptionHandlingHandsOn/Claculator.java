package ExceptionHandlingHandsOn;

import java.util.Scanner;

public class Claculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			try {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if (a < 0 || b < 0) {
					throw new Exception("n or p should not be negative.");
				}
				else if (a == 0 && b == 0) {
					throw new Exception("n and p should not be zero.");
				}
				else {
					int val = 1;
					for (int j = 0; j < b; j++) {
						val *= a;
					}
					System.out.println(val);
				}

			} catch (Exception e) {
				System.out.println(e);
			}
		}
		sc.close();
	}
}