package ControlFlowHandsOnHard;
import java.util.Scanner;
public class FestivalDiscount {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCost = sc.nextDouble();
        double discountRate;

        if (totalCost < 2000) {
            discountRate = 0.05;
        }
        else if (totalCost < 5000) {
            discountRate = 0.25;
        } 													//Assigning discount rate
        else if (totalCost < 10000) {
            discountRate = 0.35;
        } 
        else {
            discountRate = 0.50;
        }

        double amountToPay = totalCost - (totalCost * discountRate);
        
        System.out.println(amountToPay);
        
        sc.close();
    }
}
