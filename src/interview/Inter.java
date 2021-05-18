package interview;

public class Inter extends Outer{
	
	public static void run() {
		System.out.println("Inside A");
	}

	public static void main(String[] args) {
		run();
		
		Inter inter = new Inter();
		inter.run();
		
		Outer outer = new Outer();
		outer.run();
		
		Outer outer1 = new Inter();
		outer1.run();
		
		
		String s1 = "AABCD";
		String s2 = "BCDDF";
		int i = s2.indexOf(s1.charAt(0));
		String temp;
		if(i==-1) {
			System.out.println(false);
		} else {
			String s = s2.substring(i, s2.length());
			temp = s + s2.substring(0, i);

			if (s1.equals(temp)) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}

}


class Outer {
	public static void run() {
		System.out.println("Inside B");
	}
}