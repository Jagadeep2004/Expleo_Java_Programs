package ControlFlowHandsOnEasy;
import java.util.Scanner;
public class PrintAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch1 = 'a';								
		char ch2 = 'z';
		
		for(int i = 0;i < 26;i++) {
					
			System.out.println(ch1+""+ch2);					
			ch1++;											// Incrementing & Decrementing ch1 & ch2
			ch2--;
		}
		
		sc.close();
	}

}
