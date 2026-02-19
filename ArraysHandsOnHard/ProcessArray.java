package ArraysHandsOnHard;

import java.util.Scanner;

public class ProcessArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			count++;
			if(arr[i]<0) {
				break;
			}
		}
		
		for(int i=0;i<count;i++) {
			if(arr[i]%7==0 && arr[i]%8==0) {
				arr[i]=-6;
			}
			else if(arr[i]%7==0) {
				arr[i]=-2;
			}
			else if(arr[i]%8==0){
				arr[i]=-9;
			}
		}
		
		for(int i=0;i<count-1;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
