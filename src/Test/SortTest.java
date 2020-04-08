package Test;

public class SortTest {

	public static void main(String[] args) {
		
		String s ="0110";
		char temp;
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr);
	}

}
