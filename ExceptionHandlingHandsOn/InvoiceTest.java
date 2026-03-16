package ExceptionHandlingHandsOn;

import java.util.Scanner;
import java.util.InputMismatchException;

class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice(int partNumber, String partDescription, int quantity, double pricePerItem) {
        if (partNumber <= 0) {
            throw new IllegalArgumentException("Part number must be greater than 0");
        }
        if (partDescription == null || partDescription.trim().isEmpty()) {
            throw new IllegalArgumentException("Part description cannot be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        if (pricePerItem <= 0) {
            throw new IllegalArgumentException("Price per item must be greater than 0");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public void displayInvoice() {
        System.out.println("Invoice Details:");
        System.out.println("Part Number: " + partNumber);
        System.out.println("Part Description: " + partDescription);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price per Item: " + pricePerItem);
        System.out.println("Total Amount: " + getInvoiceAmount());
    }
}

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter part number: ");
            int partNumber = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter part description: ");
            String partDescription = sc.nextLine();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter price per item: ");
            double pricePerItem = sc.nextDouble();

            Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);
            invoice.displayInvoice();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter correct values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
