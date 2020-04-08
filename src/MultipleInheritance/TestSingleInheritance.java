package MultipleInheritance;

class Animal{
	
	void eat() {
		System.out.println("Animal eating");
	}
	
	void laugh() {
		System.out.println("Animal laughing");
	}
}

class Dog extends Animal{
	
	@Override
	void eat() {
		System.out.println("DOG eating");
	}
	
	void bark(){
		System.out.println("DOG barking");
	}
}

public class TestSingleInheritance {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
		d.laugh();
		
		// Upcasting
		Animal a = new Dog();
		a.eat();
		a.laugh();
	}
}
