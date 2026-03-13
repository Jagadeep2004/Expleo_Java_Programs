package JAVA_BASICS;

class O_Class{
	int value = 10;
	public void outerclassMethod() {
		class I_Class{
			
			public void innerClassMethod() {
				System.out.print("Successfully executing"+value);
			}
		}
		I_Class i = new I_Class();
		i.innerClassMethod();
		
	}
}
public class MethodLocalInnerClassExample {

	public static void main(String[] args) {
		O_Class o = new O_Class();
		o.outerclassMethod();

	}

}
