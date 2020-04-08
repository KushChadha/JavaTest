package Test;

public class Statis {
	
	static void abc() {
		System.out.println("abc");
	}
	
	void abc(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Statis.abc();
		Statis s = new Statis();
		s.abc(1);
	}

}
