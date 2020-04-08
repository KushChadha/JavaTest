package Test;

import java.util.ArrayList;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		
		String[] s = new String[2];
		for(int i =0; i<s.length;i++){
			s[i] = "an";
			System.out.println(s[i]);
		}
		int ab = s.length;
		System.out.println(ab);
		
		ArrayList<String> aaaa = new ArrayList<String>();
		aaaa.add("aaa");
		aaaa.add("bbb");
		System.out.println(aaaa);
		System.out.println(aaaa.size());
	}

}
