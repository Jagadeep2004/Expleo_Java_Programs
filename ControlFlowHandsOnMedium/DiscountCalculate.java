package ControlFlowHandsOnMedium;
import java.util.Scanner;
public class DiscountCalculate {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Price : ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity : ");
        int quantity = sc.nextInt();

        
        double totalCost = price * quantity;			// calculate total cost

        
        if (quantity > 500) {
            double discount = totalCost * 0.15; 
            totalCost -= discount;									// Calculate discount
            System.out.printf("Discount : %.2f%n", discount);
        }

        
        
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.printf("Total Expenses: %.2f%n", totalCost);

        sc.close();
	}
}
