package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StringConstructionTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			int result = stringConstruction(s);
			System.out.println(result);
//			bufferedWriter.write(String.valueOf(result));
//			bufferedWriter.newLine();
		}

//		bufferedWriter.close();

		scanner.close();
	}

	// Complete the stringConstruction function below.
	static int stringConstruction(String s) {
		int price = 1;
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] != arr[i+1]) {
				price = price +1;
			}
		}
		
		return price;
	}

}
