package hackerEarth;

import java.util.Scanner;

// a,e,i,o,u is a good string
public class GoodString {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int count1 = 0, count2 = 0;
		String s = scanner.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u'){
				count1 = count1 + 1;
			}
			else{
				if(count1 > count2){
					count2 = count1;
				}
				count1 = 0;
			}
		}
		if(count1 > count2){
			System.out.println(count1);
		}
		else
			System.out.println(count2);
		
		
	}

}
