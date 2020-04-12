package hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagramsTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
    
    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
    	/*int count =0;
    	
    	List<String> l1 = new ArrayList<String>();
    	List<String> l2 = new ArrayList<String>();
    	
    	for (int i = 0; i < s1.length(); i++) {
			l1.add(s1.charAt(i)+"");
		}
    	
    	for (int i = 0; i < s2.length(); i++) {
			l2.add(s2.charAt(i)+"");
		}
    	
    	for (int i = 0; i < l1.size();) {
    		int temp = 0;
    		for (int j = 0; j < l2.size();) {
				if (l1.get(i).equals(l2.get(j))) {
					l1.remove(i);
					l2.remove(j);
					temp = 1;
					break;
				} else {
					j++;
				}
			}
    		if (temp != 1) {
    			i++;
    		}
		}
    	
    	count = l1.size() + l2.size();
    	
    	return count;*/
    	
		int[] temp = new int[26];
		for (int i = 0, j = 0; i < s1.length() || j < s2.length(); i++, j++) {
			if (i < s1.length())
				temp[s1.charAt(i) - 'a']++;
			if (j < s2.length())
				temp[s2.charAt(j) - 'a']--;
		}
		
		int count = 0;
		for (int i = 0; i < 26; i++) {
			count += Math.abs(temp[i]);
		}
		
		return count;
    	
    }

}
