package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class RecognizeInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the character : ");
		char ch = sc.next().charAt(0);
		ch = Character.toLowerCase(ch);					// Getting character input
		
		switch(ch) {
		
		case 'a':
			System.out.println("It is vowel");
			break;
			
		case 'e':
			System.out.println("It is vowel");
			break;
			
		case 'i':
			System.out.println("It is vowel");
			break;
			
		case 'o':
			System.out.println("It is vowel");
			break;
		
		case 'u':
			System.out.println("It is vowel");
			break;
														// Using switch case to determine the type of charcter
		default:
			if(Character.isLetter(ch)) {
				System.out.println("It is consonant");
			}
			else {
				System.out.println("It is symbol");
			}
		}
		sc.close();
	}

}
