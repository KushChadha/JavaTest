package bold;

public class StringTest {

	public static void main(String[] args) {
		String a = new String("Hello");
		String b = "Hello";
		String c = new String("Hello");
		String d = a;
		compare(a,b);
		compare(a,c);
		compare(a,d);
	}

	private static void compare(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("s1==s2");
		}
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
		}
	}
	
	
}
