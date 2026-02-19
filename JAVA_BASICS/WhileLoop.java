package JAVA_BASICS;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int MaxSeatCount = 10, seatCount = 0;
		
		while(seatCount < MaxSeatCount) {
			System.out.println(MaxSeatCount - seatCount);
			seatCount++;
		}

	}

}
