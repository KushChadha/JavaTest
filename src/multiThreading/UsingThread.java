package multiThreading;

class Runner extends Thread {
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Print " + i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class UsingThread {

	public static void main(String[] args) {
		// these both will tell thread class to search for run method and start the run method execution.
		Runner c1 = new Runner();
		c1.start();
		Runner c2 = new Runner();
		c2.start();
		
		// this will run in the main class thread and it will directly call the run method
		Runner c3 = new Runner();
		c3.run();
	}

}
