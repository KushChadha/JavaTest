package hackerEarth;

import java.io.*;
import java.util.*;


public class ThoughtWorksTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int arr_size = Integer.parseInt(br.readLine().trim());
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[arr_size];
            for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
            {
            arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }

            String out_ = answer(arr,arr_size);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String answer(int[] arr, int N){
    	if (N%2 != 0) {
			return "NO";
		}
    	Arrays.sort(arr);
    	for (int i = 0; i < N-1; i++) {
			if (arr[i] == arr[i+1]) {
				i++;
			} else {
				return "NO";
			}
		}
    	return "YES";
   
    }
}