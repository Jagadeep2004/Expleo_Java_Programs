package JAVA_BASICS;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[3];
		String[] str = new String[5];
		
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[-1] = 3;
		
		str[0] = "Hello";
		str[1] = "All";
		str[2] = "Hi";
		
		for(String val:str) {
			System.out.print(val+" ");
		}
	}

}
