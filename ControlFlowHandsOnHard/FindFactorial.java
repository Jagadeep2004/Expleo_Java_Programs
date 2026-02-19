package ControlFlowHandsOnHard;
import java.util.Scanner;
public class FindFactorial {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the factorial number : ");
	        int n = sc.nextInt();
	        
	        int sum = 1;
	        int i = 1;
	        
	        while(sum < n){
	            sum *= i;										//Calculating factorial number
	            i++;										
	        }
	        if(sum == n){
	            System.out.print(i-1);
	        }
	        else{
	            System.out.print("Sorry the given number is not a perfect factorial");
	        }
	        sc.close();
	    }
}
