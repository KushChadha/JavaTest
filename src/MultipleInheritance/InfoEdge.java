package MultipleInheritance;

class A {
	public void a() {
		System.out.println("I am in a()");
	}
	public void c() {
		System.out.println("I am in c()");
	}
}

public class InfoEdge extends A {
	
	public void a() {
		System.out.println("I am in infoedge");
	}

	public void b() {
		System.out.println("I am in b()");
	}

	public static void main(String[] args) {

		A a = new A();
		a.a();
//		a.b();     Cannot call child class method from parent object
		a.c();

		InfoEdge b = new InfoEdge();
		b.a();
		b.b();
		b.c();

		A c = new InfoEdge();
		c.a();
//		c.b();    Cannot call child class method from parent reference variable
		c.c();

//		InfoEdge d = new A();

	}

}
