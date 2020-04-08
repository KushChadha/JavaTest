package hackerEarth;

import java.util.Scanner;

// find the square of number
public class SquareTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number of rows");
        String[] s = new String[scanner.nextInt()];
        scanner.nextLine();
        
        for (int i = 0; i < s.length; i++) {
        	s[i] = scanner.nextLine();
		}
        
        for (String string : s) {
        	Integer i = new Integer(string);
        	System.out.println(i*i);
		}
	}

}
