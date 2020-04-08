package Test;

class B{
	ThisTest obj;

	public B(ThisTest obj) {
		this.obj = obj;
	}

	void display(){
		System.out.println(obj.data);
	}
}

class A{
	void m() {
		System.out.println(this);
	}
}

class Abc{
	int rollno;
	String name;
	int fee;
	Abc(int rollno, String name, int fee){
		this.rollno = rollno;
		this.name = name;
	}
	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}
}

class Aaa{
	void m() {
		System.out.println(" i am in M");
	}
	
	void n() {
		System.out.println(" i am in N");
		this.m();
	}
}
public class ThisTest {
	
	int data = 10;
	
	ThisTest() {
		B b = new B(this);
		b.display();
	}
	
	public static void main(String[] args) {
		// this: to refer current class instance variable
		Abc abc = new Abc(123, "Kush", 20000);
		abc.display();
		
		// this: to invoke current class method
		Aaa aaa = new Aaa();
		aaa.n();
		
		// this() : to invoke current class constructor
		
		// this: to pass as argument in the constructor call
		ThisTest test = new ThisTest();
		
		// this keyword can be used to return current class instance
		A a = new A();
		System.out.println(a);
		a.m();
		}
}
