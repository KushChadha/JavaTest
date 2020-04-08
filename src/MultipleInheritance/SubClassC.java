package MultipleInheritance;


public class SubClassC extends SubClassA{
	
	public void test() {
		doSomething();
	}

	public static void main(String[] args) {
		new SubClassC().test();
	}

}
