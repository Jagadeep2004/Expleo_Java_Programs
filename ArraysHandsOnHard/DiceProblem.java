package ArraysHandsOnHard;

import java.util.Scanner;

public class DiceProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Arun dice choice : ");
        int[] arun = new int[10];
        for (int i = 0; i < 10; i++) {
            arun[i] = sc.nextInt();
        }
       
        System.out.println("Naveen dice choice : ");
        int[] naveen = new int[10];
        for (int i = 0; i < 10; i++) {
            naveen[i] = sc.nextInt();
        }

        int sumArun = 0;
        int sumNaveen = 0;

        for (int val : arun) {
            sumArun += val;
        }

        for (int val : naveen) {
            sumNaveen += val;
        }

        System.out.println("Arun total = " + sumArun);
        System.out.println("Naveen total = " + sumNaveen);

        if (sumArun > sumNaveen) {
            System.out.println("Naveen Wins!!!");
        } else if (sumNaveen > sumArun) {
            System.out.println("Arun Wins!!!");
        } else {
            System.out.println("Tie!!!");
        }

        sc.close();
	}

}
