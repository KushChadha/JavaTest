package altrons;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] arr = {1,5,3,6,2};
		
		System.out.println(second(arr));
	}
	
	
	public static int second(int[] arr) {
		
		int largest = arr[0], second = arr[1];
		if (largest<second) {
			largest = arr[1];
			second = arr[0];
		}
		
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		
		return second;
		
	}

}
