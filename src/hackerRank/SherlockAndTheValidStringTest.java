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
		
		int i = 0;
		for (Entry<Character, Integer> entry : hMap.entrySet()) {
			arr[i++] = entry.getValue();
		}
		
		int temp = arr[0], count = 0;
		
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] + 1 == temp || arr[j] == temp + 1) {
				count = count + 1;
			} else 
			
			
			System.out.println(arr[j]);
			
		}
		return s;
		
		
/*		int[] arr = new int[hMap.size()];
//		HashSet<Integer> set = new HashSet<>();
		int i = 0;

		for (Entry<Character, Integer> entity : hMap.entrySet()) {
			arr[i] = entity.getValue();
//			set.add(entity.getValue());
			i++;
		}
//		System.out.println(set);
		
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

		return "YES";*/
		
		
	}
	
/*	static String isValid(String s) {
	    final String GOOD = "YES";
	    final String BAD = "NO";

	    if(s.isEmpty()) return BAD;
	    if(s.length() <= 3) return GOOD;

	    int[] letters = new int[26];
	    for(int i = 0; i < s.length(); i++){
	        letters[s.charAt(i) - 'a']++;
	    }
	    Arrays.sort(letters);
	    int i=0;
	    while(letters[i]==0){
	        i++;
	    }
	    //System.out.println(Arrays.toString(letters));
	    int min = letters[i];   //the smallest frequency of some letter
	    int max = letters[25]; // the largest frequency of some letter
	    String ret = BAD;
	    if(min == max) ret = GOOD;
	    else{
	        // remove one letter at higher frequency or the lower frequency 
	        if(((max - min == 1) && (max > letters[24])) ||
	            (min == 1) && (letters[i+1] == max))
	            ret = GOOD;
	    }
	    return ret;
	}*/
}
