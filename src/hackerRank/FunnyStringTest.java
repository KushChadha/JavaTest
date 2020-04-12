package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FunnyStringTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);
            System.out.println(result);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
    // Complete the funnyString function below.
    static String funnyString(String s) {
    	
    	/*List<Integer> l1 = new ArrayList<>();
    	List<Integer> l2 = new ArrayList<>();
    	StringBuilder r = new StringBuilder(s).reverse();
    	char[] ch = s.toCharArray();
    	char[] ch2 = r.toString().toCharArray();
    	
    	for (int i = 0; i < ch.length-1; i++) {
    		int temp = ch[i]-ch[i+1];
			l1.add(Math.abs(temp));
		}
    	
    	for (int i = 0; i < ch2.length-1; i++) {
    		int temp = ch2[i]-ch2[i+1];
			l2.add(Math.abs(temp));
		}
    	
    	if (l1.equals(l2)) {
			return "Funny";
		} else
			return "Not Funny";*/
    	
    	int start = 0, end = s.length()-1;
    	
    	while (start<end) {
			if (Math.abs(s.charAt(start) - s.charAt(start+1)) != Math.abs(s.charAt(end) - s.charAt(end-1))) {
				return "Not Funny";
			}
			start++;
			end--;
		}
    	
    	return "Funny";
    }
	
}
