package CollectionsHandsOnProblems;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> s = new HashSet<>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			s.add(str);
		}
		
		Iterator<String> it = s.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		sc.close();
	}

}
