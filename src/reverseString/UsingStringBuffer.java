package reverseString;

public class UsingStringBuffer {

	public static void main(String[] args) {
		String s = "My name is kush";
		String[] arr = s.split(" ");
		for (String string : arr) {
			StringBuffer buffer = new StringBuffer(string);
			buffer.reverse();
			System.out.print(buffer + " ");
		}
	}

}
