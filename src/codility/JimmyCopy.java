package codility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JimmyCopy {

	public static void main(String[] args) {
		JimmyCopy jg = new JimmyCopy();
		int[] a = {7,6,5,4,3,2,2,2,6};
		System.out.println(jg.solution(a));
	}

	public int solution(int[] A) {

	    int count = 0;
	    
	    List<Integer> arr = new ArrayList<Integer>();

	    for (int i : A) {
	        arr.add(i);
	    }
	    
	    for (int i = 0; i < A.length-1; i++) {
	    	if(i%2==0) {
	    		if(A[i] < A[i+1]) {
					count++;
				}
	    	} else {
	    		if(A[i] > A[i+1]) {
					count++;
				}
	    	}
		}
	    
	    System.out.println(count);
	    
	    boolean check = false;
	    for (int j = 0; j < A.length-2 ; j++) {
	        if ((arr.get(j) - arr.get(j + 1) > 0) && (arr.get(j + 1) - arr.get(j + 2) < 0)) {
	            check = true;
	        } else if ((arr.get(j) - arr.get(j + 1) < 0) && (arr.get(j + 1) - arr.get(j + 2) > 0)) {
	            check = true;
	        } else {
	            check = false;
	            count++;
	            j++;
//	            break;
	        }
	        
	    }
	    
	    System.out.println(count);
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
