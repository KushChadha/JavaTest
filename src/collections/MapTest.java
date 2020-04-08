package collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
//		int initialCapacity = 0;
//		float loadFactor;
		Map<String, String> map = new HashMap<>();
		map.put("1", "kush");
		map.put("1", "kamal");
		System.out.println(map.get("1"));
	}

}
