package FunctionsHandsOnMedium;

import java.util.Scanner;

public class PrimeNumberInteval {
	public static void calculatePrime(int i) {
		int count = 0;
		
		
		for(int j = 1;j <= i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(i == 1) {
			System.out.println(i+" ");
		}
		if(count == 2) {
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		if(start > end) {
			System.out.println("Enter valid input");
			return;
		}
		
		for(int i = start;i <= end;i++) {
			calculatePrime(i);
		}
		
		sc.close();

	}

}
