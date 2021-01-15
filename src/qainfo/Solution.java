package qainfo;

import java.util.ArrayList;

class Solution {
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();

		strings.add("Hello");
		strings.add("Kush");
		strings.add("Selenium");
		strings.add("Auutomation");
		
		for (String string : strings) {
			for (int i = 0; i < string.length()-1; i++) {
				if (string.charAt(i) == string.charAt(i+1)) {
					System.out.println(string);
					break;
				}
			}
		}

	}

}
