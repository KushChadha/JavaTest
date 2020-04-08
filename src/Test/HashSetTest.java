package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		Collection<String> a= new ArrayList<String>();
		a.add("a1");
		a.add("a2");
		hs.addAll(a);
		hs.add("a3");
		hs.add("a1");
		System.out.println(hs.toArray()[0]);
		System.out.println(hs);
		}

}
