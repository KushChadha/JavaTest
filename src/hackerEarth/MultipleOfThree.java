package hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// multiple of 3 will print FIZZ, multiple of 5 will print BUZZ and multiple of both will print FIZZBIZZ
public class MultipleOfThree {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCase = br.readLine();      // Reading input from STDIN

        int num = new Integer(testCase);
        //Scanner
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();       
        
        String[] str = data.split(" ");
        char[] arr = data.toCharArray();
        /*System.out.println(arr[0]);
        char a = arr[0];
        int abc = Integer.parseInt(String.valueOf(a));
        System.out.println(abc);
        int b = new Integer(a);
        System.out.println(b);*/
        
        for(int i = 0; i<str.length; i++) {
        	int temp = Integer.parseInt(String.valueOf(str[i]));
        	System.out.println("temp is " + temp);
        	for (int j = 1; j <= temp; j++) {
        		if (j%3 == 0 && j%5 == 0) {
					System.out.println("FizzBuzz");
				} else if (j%3 == 0) {
					System.out.println("Fizz");
				} else if (j%5 == 0) {
					System.out.println("Bizz");
				} else {
					System.out.println(j);
				}
			}
        }
        
	}

}
