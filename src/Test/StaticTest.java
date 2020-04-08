package Test;

public class StaticTest {
	
	int rollno;
	String name;
	static String college ="ITS";
	  
	public void change(){
		college = "BBDIT";
	}
	
	StaticTest(int r,String n){
		rollno = r;
		name = n;
	}
	
	void display () {
		System.out.println(rollno+" "+name+" "+college);
	}
	
	public static void main(String args[]){
		StaticTest s1 = new StaticTest(111,"Karan");
		StaticTest s2 = new StaticTest(222,"Aryan");
		s1.display();
		s1.change();
		s2.display();
	}
	
	static{
		System.out.println("jasdfasd");
	}
}