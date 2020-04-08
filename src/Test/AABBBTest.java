package Test;

public class AABBBTest {

	public static void main(String[] args) {
		
		String s = "ABBBCCCADB";
		System.out.println(s.length());
		int count = 1;
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)==s.charAt(i+1)){
				count = count+1;
			}
			else{
				System.out.print(s.charAt(i)+""+count+" ");
				count=1;
			}
			if(i==s.length()-2){
				System.out.print(s.charAt(i+1)+""+count);
			}
		}
		
	}

}
