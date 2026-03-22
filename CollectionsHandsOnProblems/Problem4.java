package CollectionsHandsOnProblems;


import java.util.*;

public class Problem4 {

    public static Stack<String> pushAbove75(HashMap<String, Integer> studentMarks) {
        Stack<String> stack = new Stack<>();
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            if (entry.getValue() > 75) {
                stack.push(entry.getKey());
            }
        }
        return stack;
    }

    public static void popAndDisplay(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
            studentMarks.put(name, marks);
        }

        System.out.println("\nStudent Marks in the HashMap: " + studentMarks);

        Stack<String> stack = pushAbove75(studentMarks);

        System.out.println("Student Marks above 75 in the stack:");
        popAndDisplay(stack);

        sc.close();
    }
}
