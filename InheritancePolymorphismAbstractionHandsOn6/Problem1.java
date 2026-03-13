package InheritancePolymorphismAbstractionHandsOn6;

import java.util.Scanner;

class Person {
    private String name;
    private String address;

    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    
    public String getAddress() {
        return address;
    }

    
    public void setAddress(String address) {
        this.address = address;
    }


    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    
    public String toString() {
        return "Student[" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    
    public String toString() {
        return "Staff[" + super.toString() + ", school=" + school + ", pay=" + pay + "]";
    }
}

public class Problem1 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
        
        
        
        while(true) {
        	System.out.println();
        	System.out.println("1. Student");
        	System.out.println("2. Staff");
        	System.out.println("3. Exit");
        	System.out.println("Enter Choice : ");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	
        	case 1:
        		System.out.println("Enter name : ");
        		String student_name = sc.nextLine();
        		sc.nextLine();
        		System.out.println("Enter address : ");
        		String student_address = sc.nextLine();
        		System.out.println("Enter program : ");
        		String program = sc.nextLine();
        		System.out.println("Enter year : ");
        		int year = sc.nextInt();
        		System.out.println("Enter fee : ");	
        		double fee = sc.nextDouble();
        		Student s1 = new Student(student_name, student_address, program, year, fee);
        		System.out.println(s1);
        		break;
        	case 2:
        		System.out.println("Enter name : ");
        		String staff_name = sc.nextLine();
        		sc.nextLine();
        		System.out.println("Enter address : ");
        		String staff_address = sc.nextLine();
        		System.out.println("Enter program : ");
        		String school = sc.nextLine();
        		System.out.println("Enter fee : ");	
        		double pay = sc.nextDouble();
        		Staff st1 = new Staff(staff_name, staff_address, school, pay);
        		System.out.println(st1);
        		break;
        	case 3:
        		System.out.println("Exited");
        		break;
        	default:
        		break;
        	}
        	
        		
        }

        
        
    }
}