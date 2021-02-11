package Test;

class Parent {
	static void hello() {
		System.out.println("Parent");
	}
}

public class Statis extends Parent{
	
	static void hello() {
		System.out.println("Child");
	}
	
	static void abc() {
		System.out.println("abc");
	}
	
	void abc(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Statis.abc();
		Statis s = new Statis();
		s.abc(1);
	}

}


