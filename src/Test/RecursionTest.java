package Test;

public class RecursionTest {
	
	int i = 5;

	public static void main(String[] args) {
		RecursionTest r = new RecursionTest();
		r.recursion();
	}
	
	public void recursion() {
		System.out.println("inside recursion method");
		
		if (i<7) {
			i++;
			System.out.println("before recurssion " + i);
			recursion();
			System.out.println("after recurssion " + i);
			recursion();
			System.out.println("after after recurssion " + i);
		}
		
	}

}
