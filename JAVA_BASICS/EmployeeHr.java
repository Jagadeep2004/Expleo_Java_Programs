package JAVA_BASICS;

class Employee{
	int empId;
	String empName;
	double empSalary;
	
	Employee(int empId,String empName,double empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	Employee(){
		this(001,"John",50000);
		System.out.println("Default constructor called");
	}
	
	void registerEmployee() {
		System.out.println("Registering employee");
		this.displayDetails();
	}
	
	void displayDetails() {
		System.out.println("Employee id : "+empId);
		System.out.println("Employee name : "+empName);
		System.out.println("Employee salary : "+empSalary);
	}
	
	void sendForProcessing() {
		HRDepartment hr = new HRDepartment();
		hr.processEmployee(this);
	}
	
	Employee updateSalary(double hikePercentage) {
		this.empSalary = empSalary + (empSalary * hikePercentage/100);
		return this;
	}
	
	Employee updateName(String newName) {
		this.empName = newName;
		return this;
	}
}

class HRDepartment{
	void processEmployee(Employee e) {
		System.out.println("HR Department Processing Employee...");
		System.out.println("Processed Employee : "+e.empName+ " with salary "+e.empSalary+"\n");
	}
}


public class EmployeeHr {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.registerEmployee();
		
		e.sendForProcessing();
		
		System.out.println("---Updating Employee Details---");
		e.updateName("Jagadeep").updateSalary(15.5).displayDetails();
		
		e.sendForProcessing();
		
	}

}
