package BirdEye;

class A {
	public void test() {
		System.out.println("I am in A");
	}
}

public class B extends A{
	
	public void test() {
		System.out.println("I am in B");
	}

	public static void main(String[] args) {
		A a = new B();
		a.test();
	}

}
