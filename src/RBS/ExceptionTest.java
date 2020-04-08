package RBS;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionTest {
	
	double method(double a) {
		return a *=a;
	}
	
	int method(int a) {
		return a *=a;
	}
	
	float method(float a) {
		return a *=a;
	}

	public static void main(String[] args) {
		ExceptionTest main = new ExceptionTest();
		System.out.println(main.method(100));
		
		ArrayList list = new ArrayList(Arrays.asList(1));
		
		/*for (Integer i : list) {
			System.out.println(i);
		}*/
	}

}
