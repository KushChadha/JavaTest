package AirPayBan;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s = "Kush Chadha";
		StringBuffer sb = new StringBuffer();
		String s1 = "";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				s1 = s1+s.charAt(i);
//				System.out.print(s.charAt(i));
//				sb.append(s.charAt(i));
			}
		}
//		System.out.println(sb);
		System.out.println(s1);
		
	}

}
