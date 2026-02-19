package OOPs_CONCEPT;

class Employee{
	int empId;
	String empName;
	
	public void getEmployeeDetails(int id,String name) {
		empId = id;
		empName = name;
	}
	
	public void setEmployeeDetails() {
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
	}
}

public class EmployeeMain {
		
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.getEmployeeDetails(001,"John");
		emp1.setEmployeeDetails();
		emp2.getEmployeeDetails(002,"Jack");
		emp2.setEmployeeDetails();

	}

}
