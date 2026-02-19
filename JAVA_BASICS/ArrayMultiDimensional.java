/**
 * Multi dimensional array implementation
 */
package JAVA_BASICS;

public class ArrayMultiDimensional {
		public static void main(String[] args) {
			int[][] arr = {{1,2},{3,5},{4,6}};
			for(int i = 0;i < arr.length;i++) {
				for(int j = 0;j < arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
}
