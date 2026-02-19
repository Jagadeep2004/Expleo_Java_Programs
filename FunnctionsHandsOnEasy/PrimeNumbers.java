package FunnctionsHandsOnEasy;

public class PrimeNumbers {
	static void calculatePrime(int i){
		int count = 0;
		for(int j = 1;j <= 100;j++) {
			if(i % j == 0) {
				count++;
			}
		}
		if(i == 1) {
			System.out.print(i+" ");
		}
		if(count == 2) {
			System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		
		for(int i = 1;i <= 100 ;i++) {
			calculatePrime(i);
		}

	}

}
