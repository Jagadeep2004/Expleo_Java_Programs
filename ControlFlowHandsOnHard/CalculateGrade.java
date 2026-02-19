package ControlFlowHandsOnHard;
import java.util.Scanner;
public class CalculateGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double avgGrade = 0;
		int count=0;
		
		System.out.println("Enter Exam Grade : ");
		int examGrade = sc.nextInt();
		System.out.println("Enetr Exercise Grade : ");
		int exerciseGrade = sc.nextInt();
		
		if(examGrade == -1 && exerciseGrade == -1) {
			System.out.println("There is no grade");
			return ;
		}
		
		while(examGrade != -1 &&exerciseGrade != -1) {
				double finalGrade = (examGrade * 0.70) + (exerciseGrade * 0.30);
				count++;
				avgGrade += finalGrade;
				System.out.printf("Student grade : %.2f%n\n" , finalGrade);
				
				
				System.out.println("Enter Exam Grade : ");
				examGrade = sc.nextInt();
				System.out.println("Enetr Exercise Grade : ");
				exerciseGrade = sc.nextInt();
		}
		
			System.out.printf("Average Grade : %.2f%n", avgGrade/count);
			sc.close();
	}

}
