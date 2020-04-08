package reverseString;

import java.util.*;

public class UsingArrayList {

	public static void main(String[] args) {
		String name = "my name is kush";
		
		char[] chArray = name.toCharArray();
		List<Character> rev = new ArrayList<>();
		
		for (char ch : chArray) {
			rev.add(ch);
		}
		Collections.reverse(rev);
		System.out.println(rev);
		ListIterator<Character> li = rev.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println(new StringBuilder(name).reverse().toString());
		
		System.out.println("hi  "+reverse(name));
		reverseAtSamePlace(name);
	}
	
	public static String reverse(String input){
	    char[] in = input.toCharArray();
	    int begin=0;
	    int end=in.length-1;
	    char temp;
	    while(end>begin){
	        temp = in[begin];
	        in[begin]=in[end];
	        in[end] = temp;
	        end--;
	        begin++;
	    }
	    return new String(in);
	}
	
	public static void reverseAtSamePlace(String input) {
		ArrayList<String> al = new ArrayList<>();
		String[] hello = input.split(" ");
		for (String string : hello) {
			al.add(string);
		}
		System.out.println("al print = " + al);
		StringBuffer buffer = new StringBuffer();
		ArrayList<String> al2 = new ArrayList<>();
		for (int i = 0; i < al.size(); i++) {
			String rev = al.get(i);
			StringBuffer buffer2 = new StringBuffer();
			buffer2.append(rev).reverse();
			al2.add(buffer2.toString());
		}
		
		for(String finalValue : al2){
			buffer.append(finalValue + " ");
		}
		System.out.println(al2.toString());
		System.out.println(buffer);
	}

}
