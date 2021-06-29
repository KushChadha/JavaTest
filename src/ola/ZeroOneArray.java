package ola;

public class ZeroOneArray {

	public static void main(String[] args) {
		
		int arr[] = {1,0,1,0,1,1,0,0};
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				count = count + 1;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(count!=0) {
				arr[i] = 1;
				count = count - 1;
			}
			else {
				arr[i] = 0;
			}
			
			System.out.println(arr[i]);
		}
		
		
		
	}

}
