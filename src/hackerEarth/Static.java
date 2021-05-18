package hackerEarth;

import java.util.Scanner;

public class Static {
	
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		String[] str = s.split(" ");
		String string = "";
		String string2 = "";
		boolean temp = true;
		
		for (int i = 0; i < str.length; i++) {
			string2 = str[i];
			
			if(!temp && !str[i].endsWith("\"")) {
				string = string + str[i] + " ";
			}
			
			if(str[i].startsWith("\"")) {
				string = string + str[i] + " ";
				temp = false;
			} else if (str[i].endsWith("\"")) {
				string = string + str[i];
				string2 = string;
				temp = true;
			}
			
			if(temp) {
				System.out.println(string2);
				string = "";
			}
		}
	}

}
