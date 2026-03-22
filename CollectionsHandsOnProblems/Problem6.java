package CollectionsHandsOnProblems;

import java.util.*;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter first name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter last name: ");
            String lastName = sc.nextLine();
            people.add(new Person(firstName, lastName));
        }

        people.sort(Comparator.comparing(Person::getFirstName));

        System.out.println("\nSorted people by first name:");
        for (Person p : people) {
            System.out.println(p);
        }

        sc.close();
    }
}
