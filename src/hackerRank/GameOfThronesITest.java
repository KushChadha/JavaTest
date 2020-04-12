package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GameOfThronesITest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);
        System.out.println("result is " + result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
    
    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
    	char[] ch = s.toCharArray();
    	Arrays.sort(ch);
    	int count = 0;

    	for (int i = 0; i < ch.length-1; i++) {
    		if (ch[i] == ch[i+1]) {
				i++;
			} else if (i == ch.length-2)
				count = count +2;
			else
				count++;
		}
    	
    	if(count>1)
    		return "NO";
    	else
    		return "YES";
    }

}
