package JAVA_BASICS;

public class JaggrdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] bookNo = new int[4][];
		bookNo[0] = new int[]{4,5,6};
		bookNo[1] = new int[] {4,7};
		bookNo[2] = new int[] {6};
		bookNo[3] = new int[] {7,8};
		
		for(int i=0;i<bookNo.length;i++) {
			for(int j=0;j<bookNo[i].length;j++) {
				System.out.print(bookNo[i][j]+" ");
			}
			System.out.println();
		}

	}

}
