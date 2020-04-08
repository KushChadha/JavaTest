package Test;

class SuperParent{
	int id=2;
	String name="abcd";
	
	SuperParent(int id, String name){
		System.out.println("Super Class");
		this.id=id;
		this.name=name;
	}
}

class SuperChild extends SuperParent{
	float salary;
	
	SuperChild(int id, String name, float salary){
		super(id, name);
		System.out.println("Child Class");
		this.salary=salary;
	}
	
	void display(){
		System.out.println(id + " " + name + " " + salary);
	}
	
}

public class SuperTest{

	public static void main(String[] args) {
		
//		super can be used to refer immediate parent class instance variable.
//		super can be used to invoke immediate parent class method.
//		super() can be used to invoke immediate parent class constructor.
		
		
		SuperChild sc = new SuperChild(1, "kush", 10000.00f);
		sc.display();
	}

}
