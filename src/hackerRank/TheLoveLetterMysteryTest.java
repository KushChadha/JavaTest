package hackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheLoveLetterMysteryTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = theLoveLetterMystery(s);
            System.out.println(result);

//            bufferedWriter.write(String.valueOf(result));
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
    
    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {
    	
    	int count = 0;
    	List<Integer> list = new ArrayList<Integer>();
    	
    	for (int i = 0; i < s.length()/2; i++) {
    		if (s.charAt(i) > s.charAt(s.length()-i-1)) {
				count = s.charAt(i) - s.charAt(s.length()-i-1);
			} else {
				count = s.charAt(s.length()-i-1) - s.charAt(i);
			}
    		
    		list.add(count);
		}
    	
    	int newCount = 0;
    	
    	for (int i = 0; i < list.size(); i++) {
			newCount = newCount + list.get(i);
		}
    	
    	return newCount;

    }

}
