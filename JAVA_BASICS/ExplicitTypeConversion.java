package JAVA_BASICS;

public class ExplicitTypeConversion {

	public static void main(String[] args) {
		
		double d = 90000000000000.567;
		long l = (long)d;
		int i = (int)l;
										// Explicit type conversion
		System.out.println(d);
		System.out.println(l);
		System.out.println(i);

	}

}
