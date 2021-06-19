package freshwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class OccourenceOfTopThreeCharacter {

	public static void main(String[] args) {
		
		String s = "google";
		SortedMap<Character, Integer> map = new TreeMap<Character, Integer>();
		
		for(int i = 0; i<s.length(); i++) {
			
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		
		System.out.println(map);
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
		System.out.println(list);
		
		Comparator<Map.Entry<Character, Integer>> comparator = new Comparator<Map.Entry<Character,Integer>>() {
			
			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
		};
		
		Collections.sort(list, comparator);
		
		System.out.println(list);
		
		for(int i = 0; i<3; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
