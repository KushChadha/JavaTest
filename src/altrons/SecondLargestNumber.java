package altrons;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		//You have an array with unknown number of positive integers
		//For example: 7, 19, 2334, 12, 165
		
		int arr[] = new int[5];
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			arr[i] = scanner.nextInt();
			i++;
			if (i==5) {
				break;
			}
		}
		
//		int arr[] = {7, 19, 2334, 12, 165};
		secondLargestValue(arr);
		scanner.close();
		
	}

	private static void secondLargestValue(int[] arr) {
		int largest = arr[0], secondLargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i]> secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("second largest is " + secondLargest);
	}

}
