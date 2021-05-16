package codility;

import java.util.ArrayList;
import java.util.List;

public class JimmyGarden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JimmyGarden jg = new JimmyGarden();
		int[] a = {5,4,6,2,6};
		System.out.println(jg.solution(a));
	}
	
	public int solution(int[] A) {

	    int count = 0;
	    
	    List<Integer> arr = new ArrayList<Integer>();

	    for (int i : A) {
	        arr.add(i);
	    }
	    
	    boolean check = false;
	    for (int j = 0; j < A.length-2 ; j++) {
	        if ((arr.get(j) - arr.get(j + 1) > 0) && (arr.get(j + 1) - arr.get(j + 2) < 0)) {
	            check = true;
	        } else if ((arr.get(j) - arr.get(j + 1) < 0) && (arr.get(j + 1) - arr.get(j + 2) > 0)) {
	            check = true;
	        } else {
	            check = false;
	            break;
	        }
	    }
	    if (check) {
	        return 0;
	    }

	    List<Integer> ab = new ArrayList<Integer>();

	    for (int i = 0; i < A.length; i++) {
	        ab.clear();
	        ab.addAll(arr);
//	        ab.remove(i);
	        int f = 0;
	        boolean okay = true;
	        while (f < A.length - 3) {
	            if (!okay && f != 0) {
	                break;
	            }
	            if ((ab.get(f) - ab.get(f + 1) > 0) && (ab.get(f + 1) - ab.get(f + 2) < 0)) {
	                okay = false;
	            } else if ((ab.get(f) - ab.get(f + 1) < 0) && (ab.get(f + 1) - ab.get(f + 2) > 0)) {
	                okay = false;
	            } else {
	                okay = true;
	            }
	            f++;
	        }
	        if (okay) {
	            count++;
	        }
	    }
	    if (count == 0)
	        count = -1;

	    return count;
	}

}
