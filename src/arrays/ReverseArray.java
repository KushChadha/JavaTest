package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr2 = new int[arr.length];
		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

	}

}
