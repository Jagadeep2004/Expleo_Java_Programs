package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile> {
	private String name;
	private int ram;
	private int price;

	Mobile(String name, int ram, int price) {
		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	String getName() {
		return name;
	}

	int getRam() {
		return ram;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int compareTo(Mobile o) {
		if (this.ram > o.getRam()) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Mobile> ml = new ArrayList<>();
		ml.add(new Mobile("jhcb",16,244));
		ml.add(new Mobile("iwue",8,756));
		ml.add(new Mobile("mcgd",4,987));
		Collections.sort(ml);
		System.out.println("After sorting :");
		for(Mobile mb : ml) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getRam()+"\t"+mb.getPrice());
			
		}
		

	}

}
