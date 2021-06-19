package freshwork;

public class ExcelColumn {

	public static void main(String[] args) {
		
//		705 = AAC
//		26 = Z
		
		StringBuilder sb = new StringBuilder();
		
		
		int columnNumber = 3;
		int reminder;
		
		while(columnNumber!=0) {
			
			reminder = columnNumber % 26;
			
			if(reminder == 0) {
				sb.append('Z');
				columnNumber = (columnNumber / 26) - 1;
			} else {
				sb.append((char)(reminder-1+'A'));
				columnNumber = columnNumber / 26;
			}
			
			
		}
		System.out.println(sb.reverse());
		
	}

}
