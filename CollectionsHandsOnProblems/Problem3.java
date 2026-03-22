package CollectionsHandsOnProblems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter text");
		String text=sc.nextLine();
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<text.length();i++) {
			if(text.charAt(i)=='a' || text.charAt(i)=='c' || text.charAt(i)=='s' || text.charAt(i)=='o') {
				map.put(text.charAt(i),map.getOrDefault(text.charAt(i), 0)+1);
			}
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
		sc.close();
	}

}
