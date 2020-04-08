package hackerRank;

import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
