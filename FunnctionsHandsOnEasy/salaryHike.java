package FunnctionsHandsOnEasy;

import java.util.Scanner;

public class salaryHike {
	public static float calculateSalaryHike(float oldSalaryPerMonth,float hike) {
		 float SalaryHike = oldSalaryPerMonth + (oldSalaryPerMonth*hike / 100);
		 return SalaryHike;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter old salary : ");
		float oldSalaryPerMonth = sc.nextFloat();
		
		System.out.println("Enter hike : ");
		float hike = sc.nextFloat();
		
		float salaryHike =  calculateSalaryHike(oldSalaryPerMonth,hike);
		
		System.out.println("Salary Hike : "+salaryHike);
		
		sc.close();

	}

}
