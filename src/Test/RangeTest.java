package Test;

import java.util.Scanner;

public class RangeTest {

	public static void main(String[] args) {
		
		int i = -2147483648;
		int k = 2147483647;
//		int j = 2147483648;    int is out of range
		System.out.println(i);
		System.out.println(k);
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(a);
		scanner.close();
	}

}
