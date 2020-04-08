package Test;

public class InterfaceTest implements InterfaceTest1, InterfaceTest2{

	public static void main(String[] args) {
		InterfaceTest1 test1 = new InterfaceTest();
		System.out.println(test1.a);
		int a = InterfaceTest2.a;
		System.out.println(InterfaceTest1.a);
		System.out.println(a);
		test1.start();
	}

	@Override
	public void start() {
		System.out.println("hello ");
		
	}

}

interface Abcd{
	
}