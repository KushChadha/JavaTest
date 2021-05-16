package unify;

import java.util.HashSet;

public class LeetCode2Test {

	static void printpair(int arr[], int sum) {

		HashSet<Integer> hashSet = new HashSet<Integer>();
		int temp;
		
		for(int i : arr) {
			temp = sum - i;
			if (hashSet.contains(temp)) {
				System.out.println("Pair is (" + temp + " , " + i + ")" );
			}
			hashSet.add(i);
			System.out.println(hashSet);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,0,-1,3};
		int sum = 2;
		printpair(arr, sum);
	}
}
