package multiThreading;

import java.util.Scanner;

class Processor extends Thread {
	private volatile boolean running = true;
			
	public void run() {
		do {
			System.out.println("hello" + running);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while(running);
	}
	
	public void shutdown() {
		running = false;
	}
	
}

public class DataCatchedProblem {

	public static void main(String[] args) {
		Processor pro1 = new Processor();
		pro1.start();
		
		System.out.println("Press return to stop...");
		
		Scanner scanner = new Scanner(System.in);
		pro1.shutdown();
		scanner.nextLine();
		
		System.out.println("helloooooooo");
	}

}
