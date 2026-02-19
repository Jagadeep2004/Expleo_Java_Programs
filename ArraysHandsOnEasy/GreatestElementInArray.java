package ArraysHandsOnEasy;

import java.util.Scanner;

public class GreatestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1=new int[n];
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();	
			if(arr1[i]>max) {
				max=arr1[i];
			}
		}
		
		System.out.println("Max : "+max);
		
	}

}
