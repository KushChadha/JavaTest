package Test;

public class StringTest {
	
	

	public static void main(String[] args) {
		
		String s1 = "Kush";
		String s2 = "Kush";
		String s3 = new String("Kush");
		String s4 = new String("Kush");
		StringBuffer s5 = new StringBuffer("Kush");
		StringBuffer s6 = new StringBuffer("Kush");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1 + " " + s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		System.out.println(s5 == s6);
		System.out.println(s5.equals(s6));
		System.out.println(convertStringToInt("10,000\n"+
"points + 60 USD"));
		
		String str = new String("https://rally1.rallydev.com/slm/webservice/v2.0/revisionhistory/227977633984");
		int i = str.lastIndexOf("/");
		System.out.println(str.substring(i + 1).replaceAll("\"", ""));
	}

	// return Integer from string
	public static Integer convertStringToInt(String str) {
		System.out.println(str);
		str = str.replaceAll("[a-z]|[A-Z]\n", "").trim();
		str = str.substring(0, str.indexOf("\n"));
		System.out.println(str);
		/*if (str.contains("p")) {
			str = str.substring(0, 6);
		}*/
		if (str.contains(",")) {
			str = str.replaceAll(",", "");
		}
		return Integer.parseInt(str);
	}

}
