package AirPayBan;

public class SortTest {

	public static void main(String[] args) {
		
		String s1 = "abcde";
		String s2 = "cdeab";
		
		if (s1.length()==s2.length()) {
			char c = s1.charAt(0);
			
			String temp = s2.substring(s2.indexOf(c), s2.length());
			String temp2 = s2.substring(0,s2.indexOf(c));
			String finalString = temp+temp2;
			if (s1.equals(finalString)) {
				System.out.println("rotational");
			} else
				System.out.println("not rotational");
			
		} else
			System.out.println("not rotational");
		
	}

}
