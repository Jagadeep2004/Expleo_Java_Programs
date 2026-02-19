package ArraysHandsOnEasy;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			if(i==49) {
				arr[i]=999;
				continue;
			}
			arr[i]=i+1;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(i+1 != arr[i]) {
				System.out.println(i+1);
				break;
			}
		}
	}

}
