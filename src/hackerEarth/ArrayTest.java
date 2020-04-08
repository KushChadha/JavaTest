package hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

// find min and max value in array
public class ArrayTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] s = new int[scanner.nextInt()];
		scanner.nextLine();
		for (int i = 0; i < s.length; i++) {
			s[i] = scanner.nextInt();
		}
		Arrays.sort(s);
		System.out.println(s[0] + " " + s[s.length-1]);
	}

}
