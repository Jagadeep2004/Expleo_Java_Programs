package ControlFlowHandsOnHard;
import java.util.Scanner;
public class ValidCarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		
		String str = String.valueOf(number);
		int sum = 0;
	        for(int i = 0; i < str.length(); i++) {
	            sum += str.charAt(i) - '0';
	        }
		
		if(str.length() < 4) {
			System.out.print(str+" is not a valid car number");
		}
		else if(sum % 3 ==0 || sum % 5 == 0 || sum % 7 == 0){
			System.out.println("Lucky number");
		}
		else {
			System.out.println("Sorry it’s not my lucky number");
		}
		sc.close();
	}

}
