package interview;

import java.util.Scanner;

public class RemoveFromString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String s1 = scanner.nextLine();
		
		System.out.println(s);
		String sb = s.replaceAll(s1, "");
		System.out.println(sb);
		
		scanner.close();
	}

}
