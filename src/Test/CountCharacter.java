package Test;

import java.util.HashSet;

public class CountCharacter {

	public static void main(String[] args) {

		String s = "ABCSASA";
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (char d : set) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (d == s.charAt(j)) {
					count = count + 1;
				}
			}
			System.out.println(d + " " + count);
		}
	}

}
