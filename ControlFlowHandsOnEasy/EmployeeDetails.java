package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class EmployeeDetails {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee ID: ");
	        String empId = sc.nextLine();
	        											  // Getting input from users
	        System.out.print("Enter Daily Wage: ");
	        double empWage = sc.nextDouble();

	        System.out.print("Enter Number of Days Worked: ");
	        int daysWorked = sc.nextInt();

	       
	        double totalSalary = empWage * daysWorked;   // Calculating total salary

	   
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + empId);
	        System.out.println("Daily Wage: " + empWage);
	        System.out.println("Days Worked: " + daysWorked);
	        System.out.printf("Total Salary: %.2f%n", totalSalary);

	        sc.close();


	}

}
