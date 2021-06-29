package ola;

public class Share {

	public static void main(String[] args) {
		int arr[] = {12,11,10,3,9,5,6};
		
		bestTime(arr);
	}

	private static void bestTime(int[] arr) {
		int buy=0, sell=0, profit=0;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[j]-arr[i]>profit) {
					profit = arr[j]-arr[i];
					buy = i;
					sell = j;
				}
					
			}
		}
		
		System.out.println(buy + " " + sell);
		
	}

}
