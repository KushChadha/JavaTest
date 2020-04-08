package Test;

class X {
	public void method (int x) {
		System.out.println("one");
	}
	
	public void method (double a) {
		System.out.println("two");
	}
}

class Y extends X {
	
	public void method (double a) {
		System.out.println("three");
	}
}

public class DataTypeTest {
	
	public void method (float a) {
		System.out.println("float");
	}
	
	public void method (double a) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		new DataTypeTest().method(1.1);
		new Y().method(100.1);
		new X().method(100.1);
	}

}
