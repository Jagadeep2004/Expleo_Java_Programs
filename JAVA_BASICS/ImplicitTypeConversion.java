package JAVA_BASICS;

public class ImplicitTypeConversion {

	public static void main(String[] args) {
		
		int i = 10;
		float a = i;					// Implicit type conversion
		long b = i;
		
		System.out.println("Int value : "+i);
		System.out.println("Float value : "+a);
		System.out.println("Long value : "+b);

	}

}
