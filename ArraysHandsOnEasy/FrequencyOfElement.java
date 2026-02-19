package ArraysHandsOnEasy;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter array elements : ");
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int flag = 0;
		for(int i=0;i<n;i++) {
			int count = 1;
			if(flag == 1) {
				continue;		
			}
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					arr[i] = 
					count++;
				}
			}
			System.out.println(arr[i]+" occurs "+count+" times");
		}
		sc.close();
	}

}
