package FunctionsHandsOnHard;

import java.util.Scanner;

public class SalaryIncrement {

    public static double calculateIncrement(double salary, double rating) {
        if (salary < 1 || salary > 10) {
            return -1; 
        }

        double increment;

        if (rating >= 1 && rating <= 4) {
            increment = salary * 0.10;
        } else if (rating <= 7) {
            increment = salary * 0.25;
        } else {
            increment = salary * 0.30;
        }

        return salary + increment;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary : ");
        double salary = sc.nextDouble();

        System.out.print("Enter the rating : ");
        double rating = sc.nextDouble();

        double result = calculateIncrement(salary, rating);

        
        System.out.println((int)result);
        

        sc.close();
    }
}
