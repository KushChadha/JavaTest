package Test;

public class MultipleMain {

	public static void main(String[] d) {
		MultipleMain main = new MultipleMain();
		main.main(1);
		main("Kush");
		main(1.1f);
	}

	void main(int a){
		System.out.println("inside int main " + a);
	}
	public static void main(String s){
		System.out.println("inside string " + s);
	}
	
	static void main(float f){
		System.out.println("inside float " + f);
	}
}
