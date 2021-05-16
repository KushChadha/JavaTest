package reverseString;

public class UsingStringBuffer {

	public static void main(String[] args) {
		String s = "My Name is Kush";
		String[] arr = s.split(" ");
		for (String string : arr) {
			StringBuffer buffer = new StringBuffer(string);
			buffer.reverse();
			System.out.print(buffer + " ");
		}
		
		System.out.println();
		System.out.println("My Name is Kush");
		
		for(int i=0; i<arr.length; i++) {
			StringBuffer buffer = new StringBuffer(arr[i]);
			buffer.reverse();
			if(i%2!=0) {
				buffer.reverse();
			}
			System.out.print(buffer + " ");
		}
	}

}
