package CrossOver;

import java.io.IOException;
import java.util.Scanner;

public class Tester {
	
    /**
     * Complete the function below.
     * DONOT MODIFY anything outside this function!
     */
    static int[] rearrange(int[] elements) 
    {
//    	int container[] = new int[100];
    	StringBuffer buffer;
    	for (int i = 0; i < elements.length; i++) {
    		buffer = new StringBuffer();
			int a = elements[i];
		    int k = 0;
		    while (a > 0){
		    	buffer.append(a%2);
//		    	container[k] = a%2;
//		    	System.out.println("chakko " + container[k]);
		        k = k+1;
		        a = a/2;
		    }
		    buffer.reverse();
		    System.out.println(buffer.reverse());
//		    for (int j = k -1 ; j >= 0 ; j--){
//		        System.out.print(container[j]);
//		    }
		}
    	
    	/*for (int i = 0; i < container.length; i++) {
    		int in = container[i];
    		System.out.println(container[i]);
//    		for (int j = 0; j < container.; j++) {
//				
//			}
//    		if(container[i]==1){
//    			int count = 0;
//				count++;
//    		}
    		
		}*/
    	
		return elements;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int[] res;
        
        int _elements_size = 0;
        _elements_size = Integer.parseInt(in.nextLine().trim());
        System.out.println("jell " + _elements_size);
        int[] _elements = new int[_elements_size];
        int _elements_item;
        for(int _elements_i = 0; _elements_i < _elements_size; _elements_i++) {
            _elements_item = Integer.parseInt(in.nextLine().trim());
            _elements[_elements_i] = _elements_item;
        }
        
        /*for (int i = 0; i < _elements.length; i++) {
        	System.out.println("_elements " + _elements[i]);
		}*/
        
        res = rearrange(_elements);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }        
    }
}