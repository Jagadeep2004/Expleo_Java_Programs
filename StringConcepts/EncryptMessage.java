package StringConcepts;

import java.util.Scanner;

public class EncryptMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2="";
		
		
		for(int i=0;i<str1.length();i++) {
			if(Character.isLetter(str1.charAt(i))) {
				char temp = (char)(str1.charAt(i) + 3);
				if(temp == 'X' || temp == 'Y' || temp == 'Z' || temp == 'x' || temp == 'y' || temp == 'z') {
                    temp -= 26;
                }
				str2=str2+temp;
			}
			else if(str1.charAt(i)==' ') {
				str2=str2.concat("_");
			}
			else {
				str2=str2.concat(String.valueOf(str1.charAt(i)));
			}
		}
		
		System.out.println(str2);
		sc.close();

	}

}
