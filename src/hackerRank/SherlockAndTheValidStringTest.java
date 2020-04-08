package hackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAndTheValidStringTest {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = isValid(s);
		System.out.println("result is " + result);

//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}

	// Complete the isValid function below.
	static String isValid(String s) {

		if (s.length() == 1) {
			return "YES";
		}

		/*
		 * char[] ch = s.toCharArray(); Arrays.sort(s.toCharArray()); int[] a; for (int
		 * i = 0; i < ch.length; i++) { a = }
		 */

		HashMap<Character, Integer> hMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (hMap.containsKey(s.charAt(i))) {
				hMap.put(s.charAt(i), hMap.get(s.charAt(i)) + 1);
			} else {
				hMap.put(s.charAt(i), 1);
			}
		}
		System.out.println(hMap);
		int[] arr = new int[hMap.size()];
		HashSet<Integer> set = new HashSet<>();
		int i = 0;

		for (Entry<Character, Integer> entity : hMap.entrySet()) {
			arr[i] = entity.getValue();
			set.add(entity.getValue());
			i++;
		}
		System.out.println(set);
		
		Arrays.sort(arr);
		int count = 0;
		
		for (int j = 0; j < arr.length-1; j++) {
			System.out.println(arr[j]);
			if(arr[j]!= arr[j+1]) {
				count++;
			}
		}
		System.out.println(count);
		if (count>1) {
			return "NO";
		}
		if (set.size() == 1) {
			return "YES";
		}
		if (set.size() > 2) {
			return "NO";
		}
		if (arr[0] == 1 && arr[1] > 1) {
			return "YES";
		}
		
		for(int j = 0; j < arr.length; j++) {
			
		}
		if (arr[0] == 1 || arr[arr.length-1] == arr[arr.length-2]+1) {
			return "YES";
		}

		return "YES";
	}
}
