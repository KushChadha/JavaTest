package synechron;

public class IntegerReverse {

	public static void main(String[] args) {
		int num = 9934;
		int temp = 0;
		while (num !=0 ) {
			int newNum = num % 10;
			num = num / 10;
			temp = temp*10 + newNum;
		}
		System.out.println(temp);
	}

}
