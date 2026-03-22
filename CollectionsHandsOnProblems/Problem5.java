package CollectionsHandsOnProblems;


import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();
        
        while (true) {
            System.out.print("Enter a number (or type 'done' to finish): ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number or 'done'.");
            }
        }

        if (numbers.isEmpty()) {
            System.out.println("No numbers entered.");
            return;
        }

        System.out.println("Sorted unique numbers: " + numbers);

        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average: " + average);

        System.out.println("Lowest: " + numbers.first());
        System.out.println("Highest: " + numbers.last());

        List<Integer> oddNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        System.out.println("Odd numbers: " + oddNumbers);

        sc.close();
    }
}