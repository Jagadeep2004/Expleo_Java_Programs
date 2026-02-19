package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class CheckCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Charcter : ");
		char ch = sc.next().charAt(0);						//Getting character input
		ch = Character.toLowerCase(ch);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("It is vowel");
		}																// Checking conditions
		else if(Character.isLetter(ch)) {
			System.out.println("It is consonant");
		}
		else {
			System.out.println("It is symbol");
		}
		
		sc.close();
	}

}
