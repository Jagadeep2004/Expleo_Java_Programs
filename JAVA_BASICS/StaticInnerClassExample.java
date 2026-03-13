package JAVA_BASICS;

class Person1{
	int age = 21;
	static int weight = 45;
	static class Gender{
		void nonStatic() {
			System.out.println("Non static method :"+weight);
		}
		static void staticDisplay() {
			System.out.println("Static method :"+weight);
		}
	}
	Gender gender = new Gender();
}
public class StaticInnerClassExample {

	public static void main(String[] args) {
		Person1 person = new Person1();
		person.gender.nonStatic();
		Person1.Gender.staticDisplay();

	}

}
