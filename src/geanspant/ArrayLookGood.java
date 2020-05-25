package geanspant;

public class ArrayLookGood {

	public static void main(String[] args) {
		
		int[] arr = {1,12,123,1234,12345};
		int length = 0;
		
		for (int i = 0; i < arr.length; i++) {
			length = String.valueOf(arr[i]).length();
			System.out.print("+");
			for (int j = 0; j < length; j++) {
				System.out.print("-");
			}
		}
		System.out.println("+");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("|" + arr[i]);
		}
		System.out.println("|");
		
		for (int i = 0; i < arr.length; i++) {
			length = String.valueOf(arr[i]).length();
			System.out.print("+");
			for (int j = 0; j < length; j++) {
				System.out.print("-");
			}
			
		}
		System.out.println("+");
		
	}

}
