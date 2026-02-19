package OOPs_CONCEPT;

public class Theatre {
	int theatreId = 2004;
	String theatreName = "ROX";
	String theatreLocation = "Kochi";
	
	public void displayTheatre() {
		System.out.println("Theatre ID : "+theatreId);
		System.out.println("Theatre Name : "+theatreName);
		System.out.println("Theatre Location : "+theatreLocation);
	}
	
	public static void main(String[] args) {
		
//		Theatre t = new Theatre();
		
		Theatre t;
		t = new Theatre();
		
		
		t.displayTheatre();
	}
}
