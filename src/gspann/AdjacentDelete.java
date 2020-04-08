package gspann;

public class AdjacentDelete {

	public static void main(String[] args) {
		
		String str = "AAAA";
		int count = 0;
		String str2 = "";
		str2 = str2 + str.charAt(0);
		
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i +1)) {
				count = count+1;
			} 
			if (str.charAt(i) != str.charAt(i +1)) {
				str2 = str2 + str.charAt(i +1);
			}
		}
		System.out.println(str2);
		System.out.println(count);
	}

}
