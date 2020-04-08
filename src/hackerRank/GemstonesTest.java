package hackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GemstonesTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			String arrItem = scanner.nextLine();
			arr[i] = arrItem;
		}

		int result = gemstones(arr);
		System.out.println("result is " + result);

//	        bufferedWriter.write(String.valueOf(result));
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();

		scanner.close();
	}

	// Complete the gemstones function below.
	static int gemstones(String[] arr) {
		List<Character> list = new ArrayList<>();
		for (char c = 'a'; c <= 'z'; c++) {
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].contains(String.valueOf(c))) {
					count = count+1;
				}
			}
			if (count == arr.length) {
				list.add(c);
			}
		}
		return list.size();
	}

}
