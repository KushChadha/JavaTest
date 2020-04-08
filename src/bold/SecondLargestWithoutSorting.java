package bold;

public class SecondLargestWithoutSorting {

	public static void main(String[] args) {
		
		int arr[] = {12, 13, 8, 10, 3, 25, 29, 26};
		int largest = arr[0];
		int secLargest = arr[0];
		System.out.println(arr.length);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secLargest) {
				secLargest = arr[i];
			}
		}
		
		System.out.println(secLargest);
		
	}

}
