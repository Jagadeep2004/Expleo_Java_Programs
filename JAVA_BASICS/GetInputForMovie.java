package JAVA_BASICS;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GetInputForMovie {

	public static void main(String[] args) throws ParseException  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Ticket ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Enter Movie Name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter Movie Description : ");
		String description = sc.nextLine();
		
		System.out.print("Enter Language : ");
		String language = sc.next();
		
		System.out.print("Enter Genre: ");
		String genre = sc.next();
		
		System.out.print("Enter Date (dd/MM/yyyy): ");
		String d = sc.next();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(d);
		
		System.out.print("Enter Cost : ");
		float cost = sc.nextFloat();
		
		System.out.println("ENTER MOVIE DETAILS");
		System.out.println("Movie ID : "+id);
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Description : "+description);
		System.out.println("Movie Language : "+language);
		System.out.println("Movie Genre : "+genre);
		System.out.println("Movie Release Date : "+date);
		System.out.println("Movie Cost : "+cost);
		
		sc.close();
			

	}

}
