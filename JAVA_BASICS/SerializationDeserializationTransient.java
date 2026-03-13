package JAVA_BASICS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee2 implements java.io.Serializable {
	private static final long serialversionUID = 129348938L;
	transient int empId;
	static int deptId;
	String empName;
	int empAge;

	public Employee2(String name, int age, int id, int deptid) {
		empName = name;
		empAge = age;
		empId = id;
		deptId = deptid;
	}
}

public class SerializationDeserializationTransient {

	public static void main(String[] args) {
		Employee2 object = new Employee2("Ram", 29, 2, 1000);
		String filename = "Ram.txt";
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(object);
			out.close();
			file.close();
			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(object);
			object.deptId = 2000;
			object.empAge = 100;
		} catch (IOException ex) {
			System.out.println("IOExceptionis caught");
		}
		object = null;

		try {

			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			object = (Employee2) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(object);
		} catch (IOException ex) {
			System.out.println("IOExceptionis caught");
		} catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}

	}

	private static void printdata(Employee2 object) {
		System.out.println("Employee Name : " + object.empName);
		System.out.println("Employee Age  : " + object.empAge);
		System.out.println("Employee Id   : " + object.empId);
		System.out.println("Department Id : " + Employee2.deptId);
	}

}
