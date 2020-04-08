package RBS;

import java.io.FileNotFoundException;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		
		try {
			System.out.println("in try");
		} /*catch(FileNotFoundException e) {
			System.out.println("in catch");
		}*/ finally {
			System.out.println("in finally");
		}

	}

}
