package ArraysHandsOnMedium;

import java.util.Scanner;

public class FrequencyOfKValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();	
		}
		
		int k = sc.nextInt();
		int count =0;
		
		for(int i=0;i<n;i++) {
			if(k == arr1[i]) {
				count++;
			}
		}
		
		System.out.println(k+" occurs "+ count+" times");
		sc.close();
	}

}
