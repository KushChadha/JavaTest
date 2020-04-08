package hackerRank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class TwoStringsTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            
            String s2 = scanner.nextLine();
            
            String result = twoStrings(s1, s2);
            System.out.println("result is " + result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
    	
    	/*HashSet<Character> chs1 = new HashSet<Character>();
    	for (int i = 0; i < s1.length(); i++) {
			chs1.add(s1.charAt(i));
		}
    	
    	String s = chs1.toString();
    	System.out.println(s);
    	for (int i = 0; i < s.length(); i++) {
			if (s2.contains(s.charAt(i) + "") ) {
				return "YES";
			}
		}
    	return "NO";*/
    	
    	for(String s : new HashSet<String>(Arrays.asList(s1.split("")))) {
            if (s2.contains(s)) {
                return "YES";
            }
        }
        return "NO";
    	
    	
    }

}
