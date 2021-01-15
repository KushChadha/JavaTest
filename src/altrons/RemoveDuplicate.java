package altrons;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String str = "My name is Meme";
		removeDup(str);
	}
	
	public static void removeDup(String str) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		String s = new String();
		
		for (int i = 0; i < str.length(); i++) {
			int index = s.indexOf(str.charAt(i));
			
			if (index == -1) {
				s = s + str.charAt(i);
			}
			
//			if (!list.contains(str.charAt(i))) {
//				list.add(str.charAt(i));
//			}
		}
		
		System.out.println(s);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.print(list.get(i));
//		}
		
//		return null;
		
	}

}
