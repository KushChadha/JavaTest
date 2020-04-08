package RBS;

public class ConstructorTest {
	
	public ConstructorTest() {
		this(10);
		System.out.println("i am in constructor");
	}
	
	public ConstructorTest(int i) {
		System.out.println("i am in constructor with parameter");
	}

	public static void main(String [] args) {
		ConstructorTest c = new ConstructorTest(10);
		ConstructorTest v = new ConstructorTest();
		
		// runtime error
		System.out.println(Integer.parseInt("Abc"));
	}

}
