package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class BloodDonarEligibility {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  
        System.out.print("Enter Age: ");					// Getting age & weight input
        int age = sc.nextInt();

        System.out.print("Enter Weight : ");
        double weight = sc.nextDouble();


        if (age > 18 && age < 55 && weight > 45) {							// Calculating eligibility
            System.out.println("The donor is eligible to donate blood");
        } 
        else {
            System.out.println("The donor is not eligible to donate blood");
        }

        sc.close();
        
	}
}
