package OOPs_CONCEPT;

class Demo{
	int id;
	String name;
	
	Demo(){
		
	}
	Demo(int i,String name){
		this.id = id;
		this.name = name;
	}
	
	
	public void printFunc() {
		System.out.println(id);
		System.out.println(name);
	}
}

public class TheatreConstructor {

	public static void main(String[] args) {
		Demo d = new Demo(1,"John");
		Demo d1 = new Demo();
		
		d.printFunc();
		d1.printFunc();

	}

}
