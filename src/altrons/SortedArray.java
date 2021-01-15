package altrons;

import java.util.ArrayList;
import java.util.List;

public class SortedArray {

	public static void main(String[] args) {
		
		int a[] = {8,17,58,78,99,100};
		int b[] = {23,45,67,88,89,90,91,102,400};
		List<Integer> list = new ArrayList<Integer>();
		
		int c = a.length+b.length;
		
		for (int i = 0, j = 0, k=0; k < c; k++) {
			if (i<a.length && j<b.length) {
				if (a[i]<b[j]) {
					list.add(a[i]);
					i++;
				} else if (b[j]<a[i]) {
					list.add(b[j]);
					j++;
				} 
			} else if (i<a.length){
				list.add(a[i]);
				i++;
			} else {
				list.add(b[j]);
				j++;
			}
			
		}
		
		System.out.println(list);
		
		
		for (int i = list.size()-1; i >= 0; i--) {
			System.out.println(list.get(i));
		}

	}

}
