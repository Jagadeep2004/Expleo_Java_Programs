package ControlFlowHandsOnMedium;
import java.util.Scanner;
public class CalculateGrossSalary {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        double hra, da, grossSalary;
  
        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;  
            da = basicSalary * 0.80;   						// Calculating hra and da
        }
        else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;  
            da = basicSalary * 0.90;   
        } 
        else {
            hra = basicSalary * 0.30;  
            da = basicSalary * 0.95;   
        }

        grossSalary = basicSalary + hra + da;				//Calculating gross salary

        
        System.out.printf("hra :  %.2f%n", hra);
        System.out.printf("da :  %.2f%n", da);
        System.out.printf("Gross Salary : %.2f%n", grossSalary);

        sc.close();
    }

}
