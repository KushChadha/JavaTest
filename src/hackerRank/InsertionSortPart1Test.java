package hackerRank;

import java.util.Scanner;

public class InsertionSortPart1Test {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
    
    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
    	int temp, j;
    	
    	for (int i = 1; i < arr.length; i++) {
    		temp = arr[i];
    		j = i;
    		
    		while (j > 0 && arr[j-1] > temp) {
    			arr[j] = arr[j-1];
    			j = j-1;
    		}
    		arr[j] = temp;
    		for (int k = 0; k < arr.length; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println();
			
		}
    }

}
