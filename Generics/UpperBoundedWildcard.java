package Generics;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcard {

	public static void main(String[] args) {
		List<Float> i = new ArrayList<>();
		i.add(9.9f);
		i.add(8.8f);
		double sum=sum(i);
		System.out.println(sum);

	}
	
	public static double sum(List<? extends Number>list) {
		double sum=0;
		for(Number n:list) {
			sum+=n.doubleValue();
		}
		return sum;
	}

}
