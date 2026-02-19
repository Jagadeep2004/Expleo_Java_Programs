package ControlFlowHandsOnMedium;
import java.util.Scanner;
public class InternetBrowsingBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours : ");
        double hrs = sc.nextDouble();
        
        int hour = (int)hrs;
        double min  = (hrs-hour)*100;
        int bill =0;
        
        if(hour >=7) {
        	System.out.println("Not applicable");
        }
        else if(hour == 5 && min == 0) {
        	bill = 200;
        }
        else if(hour >= 5){
        	bill = hour*50 + (int)min*1;
        }
        else {
        	bill = hour*50 + (int)min*1+1;
        }
        
        System.out.print("Bill : "+bill);
        
//        System.out.println(hour);
//        System.out.println(min);
        
        sc.close();

	}

}
