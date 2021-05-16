package codility;

public class AlternativeCharactersTest {

	public static void main(String[] args) {
		
		AlternativeCharactersTest ac = new AlternativeCharactersTest();
		System.out.println(ac.solution(5));
	}
	
	public String solution(int N) {
//		String plus = "+";
//		String minus = "-";
		StringBuffer answer = new StringBuffer();
		for (int i = 0; i < N; i++) {
			if (i%2==0) {
				answer.append('+');
			} else {
				answer.append('-');
			}
		}
		System.out.println(answer);
		return new String(answer);
    }

}
