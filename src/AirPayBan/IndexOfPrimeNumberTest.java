package AirPayBan;

public class IndexOfPrimeNumberTest {

	public static void main(String[] args) {
		
		int[] a = {4,7,9,14,17,13,56,12,45,76};
		
		
		for (int i = 0; i < a.length; i++) {
			
			boolean value = primeNumber(a[i]);
			if (value==true) {
				System.out.println(a[i]);
			}
			
		}
		
		
	}
	
	public static boolean primeNumber(int i) {
		
		if(i==2 || i==3)
			return true;
		else {
			int half = i/2;
			
			for (int j = 2; j <= half; j++) {
				if (i%j == 0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
