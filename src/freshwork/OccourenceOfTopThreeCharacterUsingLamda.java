package freshwork;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OccourenceOfTopThreeCharacterUsingLamda {

	public static void main(String[] args) {
		
		String s = "google";
		
		SortedMap<Character, Integer> smap = new TreeMap<Character, Integer>();
		
		for(int i=0; i<s.length(); i++) {
			if(smap.get(s.charAt(i)) != null) {
				smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
			} else {
				smap.put(s.charAt(i), 1);
			}
		}
		
		System.out.println(smap);
		
		List<Map.Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(smap.entrySet());
		
		Collections.sort(list, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));
		System.out.println(list);
		
		for(int i=0; i<3; i++) {
			System.out.println(list.get(i));
		}
		
	}

}
