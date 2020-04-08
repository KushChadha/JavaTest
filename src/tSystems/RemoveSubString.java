package tSystems;

public class RemoveSubString {
	
	static String function(String str) {
		String first, last;
		int mid = str.length()/2;
//		System.out.println(mid);
		first = str.substring(0, mid);
		last = str.substring(mid, str.length());
//		System.out.println(first);
//		System.out.println(last);
//		System.out.println(first.charAt(0));
//		System.out.println(last.charAt(last.length() - 1));
		if (first.charAt(0) == last.charAt(last.length() - 1)) {
			System.out.println("hello");
			first = first.replaceAll(first.charAt(0)+"", "");
			last = last.replaceAll(last.charAt(last.length() - 1)+"", "");
		} else {
			System.out.println("vapis");
			return str;
		}
		str = last.concat(first);
		System.out.println(str);
		return function(str);
	}

	public static void main(String[] args) {
		String str = "aabbccddaa";
		function(str);
	}

}
