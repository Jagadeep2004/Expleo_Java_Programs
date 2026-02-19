package FunnctionsHandsOnEasy;

import java.util.Scanner;

public class VotingEligibility {
	public static void isEligible(int age) {
		
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		
		isEligible(age);
		
		sc.close();

	}

	

}
