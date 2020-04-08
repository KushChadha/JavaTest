package adobe;

import java.util.Scanner;

public class BinaryTest {

	public static void main(String[] args) {
		int j,k,count = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		k = scanner.nextInt();
		while (k != 0) {
			j = k%2;
//			System.out.println(j);
			if (j == 1) {
				count = count+1;
			}
			k = k/2;
		}
		System.out.println(count);
	}

}
