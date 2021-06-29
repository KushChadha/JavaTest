package interview;

import java.util.ArrayList;
import java.util.List;

public class EquliibriumTest {

	public static void main(String[] args) {
	    int arr[] = {-7, 1, 5, 2, -4, 3, 0};
		//int arr[] = {9,3,7,6,8,1,10};
	    int size = arr.length;
	    int left, right;
	    List<Integer> list = new ArrayList<Integer>();
	    
	    for(int i=0; i<size; i++) {
	      
	      left = 0;
	      
	      for(int j=0; j<i; j++) {
	        left = left + arr[j];
	      }
	      right = 0;
	      for(int k=i+1; k<size; k++) {
	        right = right + arr[k];
	      }
	      
	      if(left == right) {
	    	  list.add(i);
	      }
	      
	    }
	    System.out.println(list);
	    
		}

}
