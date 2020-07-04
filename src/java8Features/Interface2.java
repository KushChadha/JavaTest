package java8Features;

public interface Interface2 {
	public void run();
	
	default void method() {
		System.out.println("this is default method of interface 2");
	}
	
	static void stat() {
		System.out.println("this is static method of interface 2");
	}
}
