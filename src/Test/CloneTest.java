package Test;

public class CloneTest implements Cloneable{
	
	int rollno;
	String name;
	
	public CloneTest(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			CloneTest ct1 = new CloneTest(1, "kush");
			CloneTest ct2 = (CloneTest) ct1.clone();
			System.out.println(ct1.rollno + " " + ct1.name);
			System.out.println(ct2.rollno + " " + ct2.name);
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
