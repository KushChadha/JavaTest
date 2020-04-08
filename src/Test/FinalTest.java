package Test;

class FinalParent{
	
	final int a = 10;
	final void run() {
		
		System.out.println("hello");
		System.out.println(a);
	}
}

class FinalChild extends FinalParent{
	int a = 30;
	
	/*void run() {
		System.out.println("hi");
	}*/
	
	
}

public class FinalTest {
	
	static final int a;
	
	static {
		a = 20;
		System.out.println("helloaa");
	}

	public static void main(String[] args) {
		
		FinalChild finalchild = new FinalChild();
		System.out.println(finalchild.a);
		finalchild.run();
		
	}

}
