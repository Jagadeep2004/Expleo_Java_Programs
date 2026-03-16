package ExceptionHandlingHandsOn;

import java.util.Scanner;

class PayOutOfBoundsException extends Exception {
    public PayOutOfBoundsException(String message) {
        super(message);
    }
}

public class AccountManagement {
    private double currentBalance = 80000;
    private static final double MAX_TRANSACTION_LIMIT = 30000;

    public void checkForDebit(double amount) throws PayOutOfBoundsException {
        if (amount > MAX_TRANSACTION_LIMIT) {
            throw new PayOutOfBoundsException("Transaction amount exceeds the maximum limit of " + MAX_TRANSACTION_LIMIT);
        }
        if (amount > currentBalance) {
            throw new PayOutOfBoundsException("Insufficient balance for the transaction");
        }
    }

    public void withdrawAmount(double amount) {
        try {
            checkForDebit(amount);
            currentBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + currentBalance);
        } catch (PayOutOfBoundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        AccountManagement account = new AccountManagement();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        account.withdrawAmount(amount);
        sc.close();
    }
}
