package string;

public class SubStringTest {

	public static void main(String[] args) {
		
		String s = "Kush";
		String[] a = s.split(s.substring(s.length()));
		System.out.println(a[3]);
		System.out.println(a.length);
		System.out.println(s.length());
		System.out.println(s.substring(0));
		System.out.println(s.substring(s.length()));
		System.out.println(s.substring(4));
		System.out.println(s.substring(s.length(), s.length()));
		System.out.println(s.substring(3,4));
		System.out.println(s.substring(5));
		
		
		
		String ab = "abc";
		ab.concat("ABC");
		System.out.println(ab);
		
		int y = 2;
		System.out.println(ab + y);
	}

}
