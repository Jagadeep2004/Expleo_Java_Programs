package Generics;

class Test<T,U,R>{
	T o1;
	U o2;
	R o3;
	Test(T o1,U o2,R o3){
		this.o1=o1;
		this.o2=o2;
		this.o3=o3;
	}
	public T getDataO1() {
		return o1;
	}
	public U getDataO2() {
		return o2;
	}
	public R getDataO3() {
		return o3;
	}
}

public class GenericsDemo2 {

	public static void main(String[] args) {
		Test<Integer,String,Float> t = new Test<>(001,"Jagadeep",1.5f);
		
		System.out.println(t.getDataO1());
		System.out.println(t.getDataO2());
		System.out.println(t.getDataO3());

	}

}
