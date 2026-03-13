package JAVA_BASICS;

class OuterClass{
	public void OuterMethod() {
		System.out.println("Outer method is executed");
	}
	
	class InnerClass{
		public void InnerMethod() {
			System.out.println("Inner method is executed");
		}
	}
}
public class InnerClassExample {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.OuterMethod();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.InnerMethod();

	}

}
