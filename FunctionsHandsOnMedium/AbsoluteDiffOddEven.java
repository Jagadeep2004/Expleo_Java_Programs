package FunctionsHandsOnMedium;

import java.util.Scanner;

public class AbsoluteDiffOddEven {
	public static int[] calculateDiff(int lowerBound,int upperBound) {
		
		int evenSum = 0,oddSum = 0;
		
		for(int i = lowerBound;i <= upperBound;i++) {
			if(i % 2 == 0) {
				evenSum+=i;
			}
			else {
				oddSum+=i;
			}
		}
		int[] arr = {evenSum,oddSum,Math.abs(evenSum - oddSum)};
		return arr;
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter lowerbound : ");
		int lowerBound = sc.nextInt();
		System.out.print("Enter upperbound : ");
		int upperBound = sc.nextInt();
		
		int[] arr = calculateDiff(lowerBound,upperBound);
		
		System.out.println("Even Sum : "+arr[0]);
		System.out.println("Odd Sum : "+arr[1]);
		System.out.print("Difference : "+arr[2]);
		sc.close();

	}

}
