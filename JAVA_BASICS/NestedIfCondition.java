package JAVA_BASICS;

public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 19;
		int weight = 30;
		
		if(age > 18) {
			if(weight > 50) {
				System.out.print("Eligible to donate blood");
			}
			else {
				System.out.print("Not eligible to donate blood because of under weight");
			}
		}
		else {
			System.out.print("Under age");
		}

	}

}
