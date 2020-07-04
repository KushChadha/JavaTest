package java8Features;

public interface Interface1 {
	public void run();
	
	default void method() {
		System.out.println("this is default method of interface 1");
	}
	
	static void stat() {
		System.out.println("this is static method of interface 1");
	}

}
