package bold;

interface Eatable {
	void eat();
}

public class InterfaceTest {

	public static void main(String[] args) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("eating");
			}
		};
		e.eat();
		
	}

}
