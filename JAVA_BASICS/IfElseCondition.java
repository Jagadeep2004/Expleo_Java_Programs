package JAVA_BASICS;

public class IfElseCondition {
	public static void main(String[] args) {
	boolean n = true;
	int speed = 10;
	if(n) {
		speed--;
		System.out.print("speed is reduced to "+speed);
	}
	else {
		System.out.print("speed is "+speed);
	}
	}
}