package reverseString;

public class UsingByte {

	public static void main(String[] args) {
		String name = "my name is kush";
		System.out.println(name);
		
		char[] charArray = name.toCharArray();
		char[] result = new char[charArray.length];
		
		for (int i = 0; i < charArray.length; i++) {
			result[i] = charArray[charArray.length-i-1];
			System.out.println(result[i]);
		}
		
		String s = new String(result);
		System.out.println(s);
	}

}
