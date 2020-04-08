package MultipleInheritance;

class A {
	public void a() {
		System.out.println("I am in a()");
	}
}

public class InfoEdge extends A {
	
	/*public void a() {
		System.out.println("I am in infoedge");
	}*/

	public void b() {
		System.out.println("I am in b()");
	}

	public static void main(String[] args) {

		A a = new A();
		a.a();
		// a.b();

		InfoEdge b = new InfoEdge();
		b.a();
		b.b();

		A c = new InfoEdge();
		c.a();
//		c.b();

		// InfoEdge d = new A();

	}

}
