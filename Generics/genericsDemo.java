package Generics;

class Demo<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}

public class genericsDemo {

	public static void main(String[] args) {
		
		Demo<Integer> i =new Demo<Integer>();
		i.set(50);
		System.out.println(i.get());
		
		Demo<String> s =new Demo<String>();
		s.set("Hi");
		System.out.println(s.get());
	}

}
