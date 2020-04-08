package Test;

public class AAABBTest {

	public static void main(String[] args) {
		
		String s = "ABBAA";
		char[] c = s.toCharArray();
		for (int i = 0;i<c.length;i++) {
			int  count = 1;
			while( i < (c.length-1)){
				if(c[i]==c[i+1]){
					count = count+1;
				}
				else{
					System.out.print(c[i]+ "" +count+ " ");
					break;
				}
				i=i+1;
			}
			if(i+1==c.length){
				System.out.print(c[i]+"" +count);
			}
		}
	}

}
