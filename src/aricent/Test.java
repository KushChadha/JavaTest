package aricent;

public class Test {

	public static void main(String[] args) {
		
		String str = "abc";
		str.replaceAll("ab", "zx");
		System.out.println(str);
		System.out.println(str.replaceAll("ab", "zx"));
		
		System.out.println(10 + 15 + "ab" + 13 + 11);
		System.out.println( "ab" + 10 + 15);
		System.out.println(-10+11+"d");
		
		int a = 10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
		
	}

}
