package AirPayBan;

import java.util.*;

public class ArrayTest {

	public static void main(String[] args) {
		
		// A[] = [-5, 1, -40, 20, 6, 8, 7 ], K=15
		
		
		int arr[] = {-5, 1, -40, 20, 6, 8, 7};
		int k = 15;
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		int temp;
		
		for(int i: arr) {
			temp = k-i;
			if(hset.contains(temp)) {
				System.out.println(i + " " + temp);
			}
			hset.add(i);
		}
		
	}

}
