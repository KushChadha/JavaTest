package geanspant;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<String, Integer> marks = new HashMap<>();
		marks.put("Hindi", 12);
		marks.put("Maths", 67);

		HashMap<String, HashMap<String, Integer>> result = new HashMap<>();
		result.put("Vijay", marks);

		for (Map.Entry<String, HashMap<String, Integer>> entry : result.entrySet()) {
			for (Map.Entry<String, Integer> entry2 : marks.entrySet()) {
				System.out.println(entry.getKey() + " marks in " + entry2.getKey() + " is " + entry2.getValue());
			}
		}

	}

}
