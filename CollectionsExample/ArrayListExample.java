package CollectionsExample;


import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		System.out.println("size :"+al.size());
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("F");
		al.add("G");
		al.add("H");
		al.add(1,"I");
		System.out.println("size :"+al.size());
		System.out.println(al);
		al.remove(5);
		al.remove("H");
		System.out.println(al);

	}

}
