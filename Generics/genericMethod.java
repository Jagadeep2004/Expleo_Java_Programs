package Generics;

public class genericMethod {
	
	static <T> void genericDisplay(T element) {
		System.out.println(element);
	}

	public static void main(String[] args) {
		genericDisplay(10);
		genericDisplay("Jagadeep");
		genericDisplay(4.5);
		

	}

}