package thoughtFocus;

public class ReverseInteger {

	public static void main(String[] args) {
		
		String s = "1234567";
		System.out.println(s.length());
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
