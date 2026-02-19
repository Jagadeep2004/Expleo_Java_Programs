package FunctionsHandsOnHard;

import java.util.Scanner;

public class HighestPlacements {
	
	public static int calculateHighest(int cs,int ec,int me) {
		int highest = 0;
		if(cs > ec && cs > me) {
			highest = cs;
		}
		else if(ec > cs && ec > me) {
			highest = ec;
		}
		else {
			highest = me;
		}
	
		return highest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int csCount = sc.nextInt();
		int ecCount = sc.nextInt();
		int meCount = sc.nextInt();
		
		int result = calculateHighest(csCount,ecCount,meCount);
		
		System.out.println("Highest Placements : "+result);
		
		sc.close();
	}

}
