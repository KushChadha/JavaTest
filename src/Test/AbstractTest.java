package Test;

public class AbstractTest extends Abs {
	
	public static void main(String[] args) {
		Abs s =new AbstractTest();
		s.Animal();
	}

	@Override
	void Animal() {
		System.out.println("cow");
	}
}

abstract class Abs{
	Abs(){
		System.out.println("DOG");
	}
	abstract void Animal();
}
