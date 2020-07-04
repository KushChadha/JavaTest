package java8Features;

@FunctionalInterface
public interface FunctionlInterfaceTest {
	
	public String a();
//	public void b();
	default void c() {
		System.out.println("in C");
	}
	
	default void d() {
		System.out.println("inside D");
	}
	
	static void e() {
		System.out.println("inside e");
	}
	
	static void f() {
		System.out.println("inside f");
	}

}
