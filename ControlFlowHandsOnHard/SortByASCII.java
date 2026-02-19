package ControlFlowHandsOnHard;
import java.util.Scanner;
public class SortByASCII {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter n : ");
			int n = sc.nextInt();
			char[] arr = new char[n];
			
			System.out.println("Enter array characters : ");
			for(int i = 0;i < n;i++) {
				arr[i] = sc.next().charAt(0);
			}
	        
	        for(int i = 0;i < n;i++){
	            for(int j = 0;j < n-1-i;j++){
	                if(arr[j] > arr[j+1]){
	                    char temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	        for(char val : arr){
	            System.out.print(val+" ");
	        }
	        
	        sc.close();
		}
}
