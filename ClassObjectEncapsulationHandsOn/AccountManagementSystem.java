package ClassObjectEncapsulationHandsOn;

import java.util.Scanner;

class Account{
	private String id;
	private String name;
	private float balance;
	
	Account(String id,String name) {
		this.id = id;
		this.name = name;
		System.out.println("Account Successfully Created!!!");
	}
	
	Account(String id,String name,float balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String getId() {
		return id;
	}
	public String getname() {
		return name;
	}
	
	public void creditAmount(float amount) {
		this.balance += amount; 
	}
	
	public void debitAmount(float amount) {
		this.balance -= amount;
	}
	
	public void fundTransfer(float amount) {
		
	}
	
	public void displayAccount() {
		System.out.println("Account id : "+id);
		System.out.println("Account holder name : "+name);
		System.out.println("Account balance : "+balance);
	}
	
}
public class AccountManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = null;   
		boolean flag = true;

		do {
			System.out.println();
		    System.out.println("1. Account Creation without initial balance");
		    System.out.println("2. Account Creation with initial balance");
		    System.out.println("3. Credit Operation");
		    System.out.println("4. Debit Operation");
		    System.out.println("5. Fund Transfer");
		    System.out.println("6. Account Display");
		    System.out.println("7. Exit");

		    int n = sc.nextInt();

		    switch (n) {
		        case 1 : {
		            System.out.println("Enter account id: ");
		            String id = sc.next();
		            System.out.println("Enter account holder name: ");
		            String name = sc.next();
		            a = new Account(id, name);
		            break;
		        }
		        case 2 : {
		            System.out.println("Enter account id: ");
		            String id = sc.next();
		            System.out.println("Enter account holder name: ");
		            String name = sc.next();
		            System.out.println("Enter amount: ");
		            float amount = sc.nextFloat();
		            a = new Account(id, name, amount);
		            break;
		        }
		        case 3 : {
		            if (a == null) {
		                System.out.println("Create account first!");
		            } else {
		                System.out.println("Enter amount to credit: ");
		                float amount = sc.nextFloat();
		                a.creditAmount(amount);
		                System.out.println("Amount credited successfully!");
		            }
		            break;
		        }
		        case 4 : {
		            if (a == null) {
		                System.out.println("Create account first!");
		            } 
		            else {
		                System.out.println("Enter amount to debit: ");
		                float amount = sc.nextFloat();
		                a.debitAmount(amount);
		                System.out.println("Amount debited successfully!");
		            }
		            break;
		        }
		        case 5 : {
		        	System.out.println("Enter account id to transfer :");
		        	String transferId = sc.next();
		        	System.out.println("Enter amount :");
		        	float transferAmount = sc.nextFloat();
		            System.out.println("Fund transfered to account "+transferId);
		            a.debitAmount(transferAmount);
		            break;
		        }
		        case 6 : {
		            if (a == null) {
		                System.out.println("No account to display");
		            } 
		            else {
		                a.displayAccount();
		            }
		            break;
		        }
		        case 7 : {
		            System.out.println("Thank you!!! Visit Again");
		            flag = false;
		            break;
		        }
		        default : System.out.println("Invalid choice");
		        break;
		    }
		} while (flag==true);
		
		sc.close();

	}

}
