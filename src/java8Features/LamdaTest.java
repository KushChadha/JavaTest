package java8Features;

public class LamdaTest {
	
	public static void main(String args[]) {
		FunctionlInterfaceTest fi = () -> "abcd";/*{System.out.println("hello");
		return "abcd";};*/
		fi.a();
		System.out.println(fi.a());
	}

}
