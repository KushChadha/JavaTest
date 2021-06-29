package reverseString;

public class HelloWorldWelcome {

	public static void main(String[] args) {
		
		String s = "Hello World Welcome";
		String[] s1 = s.split(" ");
		for (String string : s1) {
			
			char[] c = string.toCharArray();
			char a = string.charAt(0);
			char b = string.charAt(string.length() - 1);
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < c.length; i++) {
				
				if(i == 0) {
					c[i] = b;
				}
				if (i == c.length - 1) {
					c[i] = a;
				}
				sb.append(c[i]);
			}
			System.out.print(sb + " ");
		}
	}

}
