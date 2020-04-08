package Test;

public class NewTest {

	public static void main(String[] args) {
		
//		char[] s = {1,0,0,1,0};
		String[] s = {"1","0","0","1","0"};
		int count = 0;
		for (int i = 0; i < s.length; i++) {
//			System.out.println(s[i]);
			if(s[i]=="1"){
				count=count+1;
			}
		}
		
		for (int i = 0; i < count; i++) {
			System.out.print(1);
		}
		for (int i = 0; i < s.length-count; i++) {
			System.out.print(0);
		}
	}

}