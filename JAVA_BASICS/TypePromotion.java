package JAVA_BASICS;

public class TypePromotion {

	public static void main(String[] args) {
		
		byte b = 127;
//		b = (byte)(b*2);
		char c = 'a';
		short s =1000;
		int i = 500000;
		float f = 5.6f;
		double d = .1345;
		double result = (f*b)+(i/c)-(d*s);   // promoted to double
		System.out.println(result);

	}

}
