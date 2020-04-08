package Test;

import java.util.Arrays;

public class PeopleStrongTest {

	public static void main(String[] args) {
		String s = "abcd";
		String s1 = new String("abcd");
//		char[] ch = new char[2];
//		System.out.println(ch);
		char[] c = s.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		System.out.println("hello " + s1.hashCode());
		System.out.println("hi " + s.hashCode());
		System.out.println(s==s1);
		System.out.println(s==null);
		System.out.println(s.equalsIgnoreCase(null));
		System.out.println(s.equalsIgnoreCase(s1));
	}
}