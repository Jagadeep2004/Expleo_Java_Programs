package ArraysHandsOnEasy;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
		
		System.out.println("Enter array elements : ");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("Minimum value : "+min);
		System.out.println("Maximum value : "+max);
		
		sc.close();
		
	}

}
