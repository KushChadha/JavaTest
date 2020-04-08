package multiThreading;

class MyThread implements Runnable {

	Thread t;
	String name;

	public MyThread(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread : " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " exiting.");
	}

}

public class MultiThread {

	public static void main(String[] args) {
		System.out.println("start");
		new MyThread("one");
		new MyThread("two");
		new MyThread("Three");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
