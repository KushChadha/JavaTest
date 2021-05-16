package convert;

public class CharToInt {

	public static void main(String[] args) {
		
		char c = '1';
		int i = Character.getNumericValue(c);
		System.out.println(i);
		
		char c1 = '2';
		int i1 = Integer.parseInt(String.valueOf(c1));
		System.out.println(i1);
		
		char c2 = 'a';
		int i2 = c2;
		System.out.println(i2);
	}

}
