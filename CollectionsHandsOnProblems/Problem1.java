package CollectionsHandsOnProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<>();
		System.out.println("How many names do you want to input?");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.print("Enter name #" + (i + 1) + " ");
			String name = sc.nextLine();
			al.add(name);
			
		}

		System.out.println("Names longer than 5 characters:");
		for (String name : al) {
			if (name.length() > 5) {
				System.out.println(name);
			}
		}
		sc.close();

	}

}
