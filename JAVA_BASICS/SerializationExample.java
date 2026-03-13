package JAVA_BASICS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Employee1 implements java.io.Serializable{
	public int id;
	public String name;
	
	public Employee1(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
}

public class SerializationExample {

	public static void main(String[] args) {
		Employee1 obj = new Employee1(1,"Ram");
		String filename="file.ser";
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex){
			System.out.println(ex);
		}
		
		Employee1 object1 =null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			object1 = (Employee1)in.readObject();
			in.close();
			file.close();
			System.out.println("deserialized");
			
			System.out.println(object1.id+" "+object1.name);
		
		}
		catch(IOException e){
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
