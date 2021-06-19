package interview;

import java.util.HashSet;
import java.util.Iterator;

public class PerfectString {

	public static void main(String[] args) {
		
		int[] s2 = {4,7,8,3,2};
		int s3 = 12;
		int temp = 0,temp1=0;
		
//		System.out.println(
//	            "Count of pairs is "
//	            + getPairsCount(arr.length, sum));
		
		
		
//		getPairsCount(s2, s3);
		
		
		for (int i = 0; i < s2.length-1; i++) {
			for (int j = 1; j < s2.length; j++) {
				if(s2[i] + s2[j] == s3) {
					temp = temp+1;
				}
				if (s2[i] + s2[j] < s3) {
					temp1 = s2[i] + s2[j];
				}
			}
		}
//		System.out.println(temp);
//		HashSet<Integer> hset = new HashSet<Integer>();
//		
//		for(int i : s2) {
//			temp = s3 - i;
//			if (hset.contains(temp)) {
//				temp1 = temp1+1;
//			}
//			hset.add(i);
//			
//		}
//		System.out.println(temp1);
		
	}
	
}
