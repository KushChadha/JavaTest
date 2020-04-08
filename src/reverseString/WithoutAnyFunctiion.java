package reverseString;

public class WithoutAnyFunctiion {

	public static void main(String[] args) {
		
		String s = "My name is kush";
		String s1 = new String();
		String[] s2 = s.split(" ");
		for (int i = s2.length-1; i>=0; i--){
			s1 = s1.concat(s2[i] + " ");
			System.out.println("a");
		}
		System.out.println(s1);
		
	}

}
