package JAVA_BASICS;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FunctionBasic {
	
	static void DisplayMovieDetails(String name, String des, double duration, String lan, String d, String country, String genre) {
		System.out.println("Movie Name : "+name);		
		System.out.println("Movie Description : "+des);
		System.out.println("Movie Duration : "+duration);
		System.out.println("Movie Language : "+lan);
		System.out.println("Movie Release Date : "+d);
		System.out.println("Movie Country : "+country);
		System.out.println("Movie Genre : "+genre);
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Movie Name : ");
		String name = sc.nextLine();
		
		System.out.print("Movie Description : ");
		String des = sc.nextLine();
		
		System.out.print("Movie Duration : ");
		double duration = sc.nextDouble();
		
		System.out.print("Movie Language : ");
		String lan = sc.next();
		
		System.out.print("Movie Release Date : ");
		String d = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(d);
		
		System.
		System.out.print("Movie Country : ");
		String country = sc.nextLine();
		
		System.out.print("Movie Genre : ");
		String genre = sc.next();
		
		DisplayMovieDetails(name,des,duration,lan,d,country,genre);
		
		sc.close();

	}

}
