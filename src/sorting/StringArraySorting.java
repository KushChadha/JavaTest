package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArraySorting {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String[] s = {"24.33", "24.48", "25.37", "25.88", "25.88", "25.93", "25.93", "28.77", "25.93", "28.77", "25.93", "28.77"};
		List<String> al = Arrays.asList(s);
		list.addAll(al);
		boolean b = validateSort(list);
		if(b==true)
			System.out.println("PASS " + al + "is sorted");
		else
			System.out.println("FAIL: " + al + "is not sorted");
	}
	
	public static boolean validateSort(List<String> elements) {
		System.out.println(elements.size() + " " + elements.get(0));
        try {
			for (int i = 1; i < elements.size(); i++) {
			    if (Float.parseFloat(elements.get(i - 1)) > Float.parseFloat(elements.get(i))) {
			        System.out.println("FAIL: " + elements + "is not sorted");
			        return false;
			    }
			}
			System.out.println("PASS " + elements + "is sorted");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("FAIL: List returned an empty response");
			e.printStackTrace();
			return false;
		}
    }

}
