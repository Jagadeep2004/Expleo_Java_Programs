package ControlFlowHandsOnMedium;
import java.util.Scanner;
public class PurchaseDiscount {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter price : ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity : ");
        int quantity = sc.nextInt();


        double purchaseAmount = price * quantity;			//Calculate purchase amount
        double discountAmount;
        double paidAmount;

        
        if (purchaseAmount > 1000) {
            discountAmount = purchaseAmount * 0.10; 		//Calculate discount
        }
        else {
            discountAmount = purchaseAmount * 0.05; 
        }

        paidAmount = purchaseAmount - discountAmount;

        System.out.printf("Purchase Amount : %.2f%n", purchaseAmount);
        System.out.printf("Discount Amount : %.2f%n", discountAmount);
        System.out.printf("Actual Amount : %.2f%n", paidAmount);

        sc.close();
    }

}
