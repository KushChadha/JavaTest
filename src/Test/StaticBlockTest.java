package Test;

public class StaticBlockTest {
	
	static {
		System.out.println("static block");
	}
	
	static void staticMethod(){
		System.out.println("static");
//		nonStatic();
	}
	
	public void nonStatic() {
		System.out.println("nonStatic");
		staticMethod();
	}
	
	public void nonStatic2() {
		System.out.println("nonStatic2");
		staticMethod();
		nonStatic();
		}
	
	public static void main(String[] args) {
		System.out.println("he");
		StaticBlockTest blockTest = new StaticBlockTest();
		blockTest.nonStatic2();
	}
	
}
