package multiThreading;

class Runners implements Runnable {

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

public class UsingRunnable {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runners());
		thread1.start();
		Thread thread2 = new Thread(new Runners());
		thread2.start();
	}

}
