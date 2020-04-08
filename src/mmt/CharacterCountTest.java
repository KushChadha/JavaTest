package mmt;

import java.util.HashSet;
import java.util.Set;

public class CharacterCountTest {

	public static void main(String[] args) {

		String s = "This is mmt test";
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (char ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			System.out.println(ch + " " + count);

		}
	}

}