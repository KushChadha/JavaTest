package mmt;

public class ObjectCountTest {
	
	static int count = 0;
	{
		count+=1;
	}

	public static void main(String[] args) {
		ObjectCountTest o1 = new ObjectCountTest();
		ObjectCountTest o2 = new ObjectCountTest();
		ObjectCountTest o3 = new ObjectCountTest();
		
		System.out.println(count);
	}

}
