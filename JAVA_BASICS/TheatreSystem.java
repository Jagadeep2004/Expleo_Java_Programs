package JAVA_BASICS;



public class TheatreSystem {
private static int totalseats = 20;
	
	TheatreSystem(){
		System.out.println("Current seats : "+totalseats);
	}
	
	public void DisplayTheatreScreen() {
		System.out.println("Current seats : "+totalseats);
	}

	public static void BookTicket(int noOfTickets) {
		System.out.println("No. of seats booked : "+noOfTickets);
		totalseats -= noOfTickets;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Screen Ticket Availability Status : ");
		TheatreSystem TS1 = new TheatreSystem();
		TS1.BookTicket(4);
		
		TheatreSystem TS2 = new TheatreSystem();
		TS2.BookTicket(5);
		TS2.DisplayTheatreScreen();
	}

}
