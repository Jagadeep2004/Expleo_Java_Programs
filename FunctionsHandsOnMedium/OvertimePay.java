package FunctionsHandsOnMedium;

import java.util.Scanner;

public class OvertimePay {
	public static void calculateOvertimePay(float emp1,float emp2,float emp3,float emp4,float emp5) {
		
		int hours = 0;
		float pay = 0;
		
		float val1 = emp1 - 40;
		if(val1 <= 0) {
			hours = 0;
			pay =0;
			System.out.println(hours+" "+pay);
			
		}
		else {
			hours = (int)val1;
			pay = val1*15;
			System.out.println(hours+" "+pay);
		}
		
		float val2 = emp1 - 40;
		if(val2 <= 0) {
			hours = 0;
			pay =0;
			System.out.println(hours+" "+pay);
		}
		else {
			hours = (int)val2;
			pay = val2*15;
			System.out.println(hours+" "+pay);
		}
		
		float val3 = emp1 - 40;
		if(val3 <= 0) {
			hours = 0;
			pay =0;
			System.out.println(hours+" "+pay);
		}
		else {
			hours = (int)val3;
			pay = val3*15;
			System.out.println(hours+" "+pay);
		}
		
		float val4 = emp1 - 40;
		if(val4 <= 0) {
			hours = 0;
			pay =0;
			System.out.println(hours+" "+pay);
		}
		else {
			hours = (int)val4;
			pay = val4*15;
			System.out.println(hours+" "+pay);
		}
		
		float val5 = emp1 - 40;
		if(val5 <= 0) {
			hours = 0;
			pay =0;
			System.out.println(hours+" "+pay);
		}
		else {
			hours = (int)val5;
			pay = val5*15;
			System.out.println(hours+" "+pay);
		}
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float emp1 =sc.nextFloat();
		float emp2 =sc.nextFloat();
		float emp3 =sc.nextFloat();
		float emp4 =sc.nextFloat();
		float emp5 =sc.nextFloat();
		
		
		calculateOvertimePay(emp1,emp2,emp3,emp4,emp5);
		
		
		
		sc.close();

	}

}
