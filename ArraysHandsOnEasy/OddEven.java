package ArraysHandsOnEasy;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] odd = new int[5];
		int[] even = new int[5];
		int o = 0,e = 0;
		for(int i = 1;i <= 10;i++) {
			if(i % 2 == 0) {
				even[e] = i;
				e++;
			}
			else {
				odd[o] = i;
				o++;
			}
		}
		System.out.print("Even numbers : ");
		for(int val1 : even) {
			System.out.print(val1+" ");
		}
		System.out.println();
		System.out.print("Odd numbers : ");
		for(int val2 : odd) {
			System.out.print(val2+" ");
		}

	}

}
