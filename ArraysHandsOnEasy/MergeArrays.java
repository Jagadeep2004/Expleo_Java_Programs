package ArraysHandsOnEasy;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1=new int[n];
		
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();	
		}
		
		int m = sc.nextInt();
		int[] arr2=new int[m];
		
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();	
		}
		
		int k = sc.nextInt();
		int[] arr3=new int[k];

		for(int i=0;i<k;i++) {
			arr3[i]=sc.nextInt();	
		}
		
		int l=arr1.length+arr2.length+arr3.length;
		
		int[] arr4 = new int[l];
		for(int i=0;i<arr1.length;i++) {
			arr4[i]=arr1[i];
		}
		int a=0;
		for(int i=arr1.length;i<l-arr3.length;i++) {
			arr4[i]=arr2[a];
			a++;
		}
		int b=0;
		for(int i=l-arr3.length;i<l;i++) {
			arr4[i]=arr3[b];
			b++;
		}
		
		for(int vals : arr4) {
			System.out.print(vals+" ");
		}
		sc.close();

	}

}
