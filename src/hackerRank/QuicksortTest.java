package hackerRank;

import java.io.IOException;
import java.util.Scanner;

public class QuicksortTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        quickSort(arr, 0, arr.length-1);

//        int[] result = quickSort(arr);
//        System.out.println(result);

        /*for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();*/

        scanner.close();
    }
    
    // Complete the quickSort function below.
    static void quickSort(int[] arr, int low, int high) {
    	
    	if (low < high) {
			
    		int pi = partition(arr, low, high);
    		
    		quickSort(arr, low, pi-1);
    		quickSort(arr, pi+1, high);
		}
    	
    }
    
	static int partition(int[] arr, int low, int high) {
    	
		int pivot = arr[high];
		int j = low;
		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		int temp = arr[j];
		arr[j] = arr[high];
		arr[high] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
    	
		return j;
    }
    
}
