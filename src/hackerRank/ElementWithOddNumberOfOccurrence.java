package hackerRank;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ElementWithOddNumberOfOccurrence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int n = 0;
		String[] arr = null;
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			n = sc.nextInt();
			arr = sc2.nextLine().split(" ");
		} catch (Exception e) {
			System.out.println("galat");
		}
		
		
		if(arr!=null) {
			if(n!=arr.length) {
				System.out.println("galat");
			} else {
				for (int i = 0; i < arr.length; i++) {
					String key = arr[i];
					if(!map.containsKey(key)) {
						map.put(key, 1);
					} else {
						map.put(key, map.get(key)+1);
					}
				}
			}
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				System.out.print(entry.getKey() + " ");
			}
		}
		
		sc.close();
		sc2.close();
	}

}
