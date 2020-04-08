package Test;

public class MessageFormat {

	public static void main(String[] args) {
		
		String abc =java.text.MessageFormat.format("hello''s {1} {0}", 5,3);
		System.out.println(abc);
	}

}
