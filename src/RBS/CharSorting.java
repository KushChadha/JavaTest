package RBS;

import java.util.Arrays;

public class CharSorting {

	public static void main(String[] args) {
		
		String s = "ASDF";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		String s1 = new String(ch);
		System.out.println(s1);
	}

}
