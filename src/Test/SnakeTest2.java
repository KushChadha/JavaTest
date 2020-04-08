package Test;

import java.util.Scanner;

public class SnakeTest2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][2];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
		
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0){
				for (int j = 0; j < arr.length; j++) {
					System.out.print(arr[i][j]);
				}
			}
			else{
				for (int j = arr.length-1; j >= 0; j--) {
					System.out.print(arr[i][j]);
				}
			}
		}
	}

}
