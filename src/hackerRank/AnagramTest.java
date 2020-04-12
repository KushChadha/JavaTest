package hackerRank;

import java.util.Scanner;

public class AnagramTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
    // Complete the anagram function below.
    static int anagram(String s) {
    	if (s.length()%2 != 0) {
    		return -1;
    	}
    	
    	int temp[] = new int[26];
    	for (int i = 0; i < s.length(); i++) {
    		if (i < s.length()/2)
    			temp[s.charAt(i) - 'a']++;
    		else
    			if (temp[s.charAt(i) - 'a'] > 0)
        			temp[s.charAt(i) - 'a']--;
    			
    	}
    	
    	int count = 0;
    	for (int i = 0; i < 26; i++) {
			count += Math.abs(temp[i]);
		}
    	
		return count;
    }

}
