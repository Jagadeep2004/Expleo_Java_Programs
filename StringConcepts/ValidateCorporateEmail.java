package StringConcepts;

import java.util.Scanner;

public class ValidateCorporateEmail {
	
	public static boolean validateEmail(String email) {
		String[] email_arr = email.split("@");

		String localPart = email_arr[0];
		String domainPart = email_arr[1];

		if (!Character.isLetter(localPart.charAt(0))) {
			return false;
			
			
		}
		if (!Character.isLetter(localPart.charAt(localPart.length() - 1))
				|| !Character.isDigit(localPart.charAt(localPart.length() - 1))) {
			return false;
		}

		for (int i = 0; i < localPart.length(); i++) {
			if(i == localPart.length()-1) {
				break;
			}
			if(localPart.charAt(i) == '.' && localPart.charAt(i) =='.') {
				return false;
			}
			else if(localPart.charAt(i) == '_' && localPart.charAt(i) =='_') {
				return false;
			}
			else if(localPart.charAt(i) == '-' && localPart.charAt(i) =='-') {
				return false;
			}
		} 
		
		if (!Character.isLetter(domainPart.charAt(0)) || !Character.isDigit(domainPart.charAt(0))) {
			return false;
		}
		if (!Character.isLetter(domainPart.charAt(domainPart.length()-1)) || !Character.isDigit(domainPart.charAt(domainPart.length()-1))) {
			return false;
		}
		
		for (int i = 0; i < domainPart.length(); i++) {
			if(i == domainPart.length()-1) {
				break;
			}
			if(domainPart.charAt(i) == '.' && domainPart.charAt(i) =='.') {
				return false;
			}
			else if(domainPart.charAt(i) == '_' && domainPart.charAt(i) =='_') {
				return false;
			}
			else if(domainPart.charAt(i) == '-' && domainPart.charAt(i) =='-') {
				return false;
			}
		}
		
		int dotCount =0;
		for(int i=0;i<domainPart.length()-1;i++) {
			if(domainPart.charAt(i)=='.') {
				dotCount++;
			}
		}
		
		if(dotCount<1) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter e-mail : ");
		String email = sc.next();
		Boolean result = validateEmail(email);

		if(result) {
			System.out.println("Valid Email");
		}
		else {
			System.out.println("Invalid Email");
		}
		
		sc.close();
		

	}

}
