package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class SumOfSeries {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of i: ");
        int i = sc.nextInt();

        int val = 1;
        int sum = 0;
         
        if(i == val) {
        	System.out.println(val);		 	// If i equals to 1 return 1
        }
        
        do {     
        	sum += val;							// Adding the continous numbers 
            val++;
        } while (sum <= i);

        System.out.println("Sum = "+ sum);

        sc.close();
	}
}
