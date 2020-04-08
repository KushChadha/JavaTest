package thoughtFocus;

public class LongestSubString {

	public static void main(String[] args) {
		
		String s = "ABAAABCDB";
		String longestSubString = "";
		int count = 0;
		
		for (int i = 0; i < s.length(); i++) {
			int count1 = 0;
			String temp = "" + s.charAt(i);
			
			for (int j = i+1; j < s.length(); j++) {
				
				if (s.charAt(i) != s.charAt(j)) {
					count1 = count1 + 1;
					temp = temp + s.charAt(j);
				} else {
					break;
				}
				
			}
			if (count1>count) {
				longestSubString = temp;
				count = count1;
			}
			
		}
		
		System.out.println(longestSubString);
		
	}

}
