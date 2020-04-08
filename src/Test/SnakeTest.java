package Test;

public class SnakeTest {

	public static void main(String[] args) {
		int count = 0;
		String[] s = {"1","2","3","4","5","6","7","8"};
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
			count = count+1;
			if(count%3==0)
			{
				if(count == s.length){
					break;
				}
				int k = i+3;
				System.out.println();
				for (int j = k; j > i; j--) {
					if(j > s.length){
						break;
					}
					System.out.print(s[j]);
					count = count+1;
				}
				i=k;
				System.out.println();
			}
		}
	}

}