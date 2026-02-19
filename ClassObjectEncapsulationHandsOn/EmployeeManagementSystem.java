package ClassObjectEncapsulationHandsOn;

import java.util.Scanner;
import java.time.LocalTime;

class Employee{
	private int empId;
	private String empName;
	
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	 public void markCheckIn(Attendance attendance) {
	        attendance.markCheckIn();
	    }
	    
	    public void markCheckOut(Attendance attendance) {
	        attendance.markCheckOut();
	    }

	    public int getEmpId() {
	        return empId;
	    }

	    public String getEmpName() {
	        return empName;
	    }
	
}
class Attendance {

    
    private int empId;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private boolean isCheckedIn;
    private boolean isCheckedOut;


    public Attendance(int empId) {
        this.empId = empId;
        this.isCheckedIn = false;
        this.isCheckedOut = false;
    }

    
    public void markCheckIn() {
        if (isCheckedIn) {
            System.out.println("Check-in already marked for today!");
        } else {
            checkInTime = LocalTime.now();
            isCheckedIn = true;
            System.out.println("Check-in successful at: " + checkInTime);
        }
    }

    
    public void markCheckOut() {
        if (!isCheckedIn) {
            System.out.println("Cannot check-out without check-in!");
        } else if (isCheckedOut) {
            System.out.println("Check-out already marked for today!");
        } else {
            checkOutTime = LocalTime.now();
            isCheckedOut = true;
            System.out.println("Check-out successful at: " + checkOutTime);
        }
    }

    
//    public String getAttendanceDetails() {
//        return "Employee ID: " + empId +
//                "\nCheck-In Time: " + (checkInTime != null ? checkInTime : "Not Marked") +
//                "\nCheck-Out Time: " + (checkOutTime != null ? checkOutTime : "Not Marked");
//    }


	@Override
	public String toString() {
		return "Attendance [empId=" + empId + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime + "]";
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        Employee emp = new Employee(id, name);
        Attendance attendance = new Attendance(id);

        boolean flag = true;

        while (flag) {
            System.out.println("\n1. Check-In");
            System.out.println("2. Check-Out");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    emp.markCheckIn(attendance);
                    break;

                case 2:
                    emp.markCheckOut(attendance);
                    break;

                case 3:
                    System.out.println(attendance.toString());
                    break;

                case 4:
                    flag = false;
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();

	}

}
