package OOPs_CONCEPT;

class Employee1{
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

public class EmployeeArrayObject {
		
	public static void main(String[] args) {
		Employee1 emp[] = new Employee1[2];
		
		for(int i = 0;i < 2;i++) {
			emp[i] = new Employee1();
		}
		
		emp[0].getEmployeeDetails(001,"John");
		emp[0].setEmployeeDetails();
		emp[1].getEmployeeDetails(002,"Jack");
		emp[1].setEmployeeDetails();

	}

}
