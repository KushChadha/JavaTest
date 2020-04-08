package reverseString;

public class UsingReverseFunction {

	public static void main(String[] args) {
		String name = "my name is kush";
		StringBuffer buffer = new StringBuffer();
		buffer.append(name);
		buffer.reverse();
		System.out.println(buffer);
		
	}

}