package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Abc");
		list.add("def");
		list.add("gfd");
		
		System.out.println(list);
		
		List<String> list1 = new ArrayList<>();
		list1.addAll(list);
		Collections.sort(list1);
		
		if (list1.equals(list)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
		
	}

}
