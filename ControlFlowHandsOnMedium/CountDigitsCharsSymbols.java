package ControlFlowHandsOnMedium;
import java.util.Scanner;
public class CountDigitsCharsSymbols {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			
			int charCount = 0;
			int digitCount = 0;
			int symbolCount = 0;
			
			for(int i = 0;i < ch.length;i++) {
				if(Character.isLetter(ch[i])) {
					charCount++;
				}
				else if(Character.isDigit(ch[i])) {
					digitCount++;
				}
				else {
					symbolCount++;
				}
			}
			
			System.out.println("Letters : "+charCount);
			System.out.println("Digits : "+digitCount);
			System.out.println("Symbols : "+symbolCount);
			
			sc.close();
		}
}
