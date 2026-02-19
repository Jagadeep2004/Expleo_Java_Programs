package ArraysHandsOnMedium;

import java.util.Scanner;

public class FrequencyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,10,10,10,20,20,20,20,40,40,50,50,30};
		
		for(int i = 0;i < arr.length;i++) {
			int count = 0;
			if (arr[i] == -1) {
				continue;
			}
			for(int j = i + 1;j < arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			System.out.println(arr[i]+" occurs "+ (count + 1) +" times");
		}
		sc.close();
	}

}
