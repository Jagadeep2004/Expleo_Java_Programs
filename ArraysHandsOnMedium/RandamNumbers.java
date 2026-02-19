package ArraysHandsOnMedium;
import java.util.*;
public class RandamNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		int[] arr = new int[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt();
		}
		
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
		

	}

}
