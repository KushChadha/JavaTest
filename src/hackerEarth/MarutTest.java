package hackerEarth;

import java.io.IOException;
import java.util.Scanner;

public class MarutTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		if(T>=1 || T<=10){
			System.out.println("Hi, " + T + ".");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			
			if(s.length()>=1 || s.length()<=100){
				if(!s.contains(" ")){
					System.out.println("Hi, " + s + ".");
				}
				else{
					System.out.println("Invalid Input");
				}
			}
			else
				System.out.println("Invalid Input");
		}
		else
			System.out.println("Invalid Test");
	}

}
