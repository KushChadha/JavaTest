package java8Features;

public class TestInterface implements Interface1{

	public static void main(String[] args) {
		
		TestInterface test = new TestInterface();
		test.run();
		test.method();
		Interface1.stat();
		Interface2.stat();
		
		
	}

	@Override
	public void run() {
		System.out.println("overriding run method");
	}
	
	static void just() {
		System.out.println("static of child");
	}

}
