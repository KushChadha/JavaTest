package Test;

class Vehicle{
	Vehicle(){
		System.out.println("asdasd");
	}
	void run() {
		System.out.println("Vehicle is running in parent class");
	}
}

class Bike extends Vehicle{
	Bike(){
		System.out.println("hi");
	}
	void run() {
		System.out.println("Bike is running in child class");
		super.run();
	}
	void abc(){
		System.out.println("hello");
		this.run();
	}
}

public class OverridingTest{
	
	public static void main(String[] args) {
		Bike test = new Bike();
		test.abc();
	}

}
