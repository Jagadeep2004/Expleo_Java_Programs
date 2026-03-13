package StringConcepts;

import java.util.Scanner;

public class RemoveTrailingSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2="";
		int startCount=0,endCount=0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)==' ') {
				startCount++;
			}
			else {
				break;
			}
		}
		
		for(int i=str1.length()-1;i>=0;i--) {
			if(str1.charAt(i)==' ') {
				endCount++;
			}
			else {
				break;
			}
		}
		
		endCount = str1.length()-endCount;
		System.out.println(str1.substring(startCount, endCount));
		
		sc.close();
	}

}
