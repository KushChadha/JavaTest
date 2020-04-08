package Test;

public class PalindromeTest {

	public static void main(String[] args) {
		int sum = 0, r, temp;
		int n = 454;
		temp = n;

		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
		
		String s = "aba";
		String rev = reverse(s);
		if (s.equals(rev)){
			System.out.println(s + " string is a palindrome");
		}
		
		String rev2 = reverse2(s);
		if(s.equals(rev2)){
			System.out.println(s + " string is a palindrome");
		}
	}
	
	public static String reverse(String s2) {
		StringBuffer buffer = new StringBuffer();
		for (int i = s2.length()-1; i >= 0; i--) {
			buffer.append(s2.charAt(i));
		}
		return buffer.toString();
	}
	
	public static String reverse2(String s){
		char[] c = s.toCharArray();
		char[] c2 = new char[s.length()];
		for (int i = 0; i<s.length(); i++) {
			c2[i] = c[c.length-i-1];
		}
		String ch = String.valueOf(c2);
		String s2 = new String(c2);
		return s2;
	}
	
}