package FunnctionsHandsOnEasy;

import java.util.Scanner;

public class SumOddEven {
	
	static void SumValues(int[] arr,int n) {
		int evenSum = 0, oddSum = 0;
		for(int i = 0;i < n ;i++) {
			if(arr[i] % 2 == 0) {
				evenSum++;
			}
			else {
				oddSum++;
			}
		}
		System.out.println("Even Sum : "+evenSum);
		System.out.println("Odd Sum : "+oddSum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter arr elements : ");
		for(int i = 0;i < n ;i++) {
			arr[i] = sc.nextInt();
		}
		
		SumValues(arr,n);
		sc.close();
	}

}
