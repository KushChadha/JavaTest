package list;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromList {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>(); 
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2); 
        
        // This makes a call to remove(Object) and  
        // removes element 1 
        al.remove(1);
        System.out.println("Modified ArrayList : " + al); 
        
        // This makes a call to remove(Object) and  
        // removes element 2 
        al.remove(2); 
        System.out.println("Modified ArrayList : " + al); 
        
        
        String s = "aabcd";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i)+"");
		}
        System.out.println(list);
        
        for (int i = 0; i < list.size()-1; i++) {
			if (list.get(i).equals(list.get(i+1))) {
				list.remove(i);
			}
		}
        
        System.out.println("new List " + list);
	}

}
