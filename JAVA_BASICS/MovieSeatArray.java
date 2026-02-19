package JAVA_BASICS;
import java.util.Scanner;
public class MovieSeatArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);

		String[][] seat = new String[3][];
		
		seat[0] = new String[2];
		seat[1] = new String[3];
		seat[2] = new String[4];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<seat[i].length;j++) {
				seat[i][j]=sc.next();
			}
		}
				
		int VIPavailableCount =0,VIPbookedCount =0,PREMIUMavailbleCount =0,PREMIUMbookedCount=0,REGULARavailableCount=0,REGULARbookedCount=0;
		
		for(int i=0;i<seat.length;i++) {
			
			for(int j=0;j<seat[i].length;j++) {
				if(i>=0 && i<=1) {
					if(seat[i][j].equals("A")) {
						VIPavailableCount++;
					}
					else {
						VIPbookedCount++;
					}	
				}
				else if(i==2) {
					if(seat[i][j].equals("A")) {
						PREMIUMavailbleCount++;
					}
					else {
						PREMIUMbookedCount++;
					}
				}
				else if(i==3){
					if(seat[i][j].equals("A")) {
						REGULARavailableCount++;
					}
					else {
						REGULARbookedCount++;
					}
				}
			}
			
			System.out.println();
		}
		
		System.out.println("Available seats in VIP : "+VIPavailableCount);
		System.out.println("Booked seats in VIP: "+VIPbookedCount);
		System.out.println("Total seats in VIP: "+(VIPavailableCount + VIPbookedCount));
		System.out.println();
		
		System.out.println("Available seats in PREMIUM : "+PREMIUMavailbleCount);
		System.out.println("Booked seats in PREMIUM: "+PREMIUMbookedCount);
		System.out.println("Total seats in PREMIUM: "+(PREMIUMavailbleCount + PREMIUMbookedCount));
		System.out.println();
		
		System.out.println("Available seats in REGULAR : "+REGULARavailableCount);
		System.out.println("Booked seats in REGULAR: "+REGULARbookedCount);
		System.out.println("Total seats in REGULAR: "+(REGULARavailableCount + REGULARbookedCount));
		System.out.println();
		
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<seat[i].length;j++) {
//				System.out.print(seat[i][j]+" ");
//			}
//			System.out.println();
//		}
	}

}
