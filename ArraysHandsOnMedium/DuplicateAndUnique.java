package ArraysHandsOnMedium;

import java.util.Scanner;

public class DuplicateAndUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();		
		}
		int duplicate=0,unique=0;
		
		for(int i=0;i<n;i++) {
			int flag = 0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					flag =1;
					break;
				}
			}
			if(flag == 1) {
				duplicate++;
			}
			else {
				unique++;
			}
		}
		System.out.println(duplicate);
		System.out.println(unique);
	}
}
