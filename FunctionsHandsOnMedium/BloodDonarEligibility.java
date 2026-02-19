package FunctionsHandsOnMedium;

import java.util.Scanner;

public class BloodDonarEligibility {

    public static boolean isEligible(int age, double weight) {
        if (age > 18 && age <= 55 && weight > 45) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age : ");
        int age = sc.nextInt();

        System.out.print("Enter weight : ");
        double weight = sc.nextDouble();

        boolean eligible = isEligible(age, weight);

        if (eligible) {
            System.out.println("Donor is eligible to donate blood.");
        } else {
            System.out.println("Donor is not eligible to donate blood.");
        }

        sc.close();
    }
}
