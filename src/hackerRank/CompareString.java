package hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CompareString {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String firstString = bufferedReader.readLine();

        String secondString = bufferedReader.readLine();

        String thirdString = bufferedReader.readLine();

        String result = Result.compareStrings(firstString, secondString, thirdString);
        System.out.println(result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();

        bufferedReader.close();
//        bufferedWriter.close();
	}
	
	static class Result {

	    public static String compareStrings(String firstString, String secondString, String thirdString) {
	    	
	    	String[] array = new String[] {firstString, secondString, thirdString};

	        Arrays.sort(array);
	        
	        String string = "";
	        
	        for (int i = 0; i < array.length; i++) {
				string = string +array[i];
			}
	        
	        return string;
	    	
	    	
	    	
	    	/*int maxLength;
	    	if (firstString.length() > secondString.length()) {
	    		maxLength = firstString.length();
			} else {
				maxLength = secondString.length();
			}
	    	
	    	if (maxLength < thirdString.length()) {
				maxLength = thirdString.length();
			}
	    	
	    	for (int i = 0, j=0, k=0; i < maxLength; i++) {
	    		if (i == firstString.length()-1) {
					sb.append(firstString);
				}
				
	    		if (firstString.charAt(i) < secondString.charAt(i) && firstString.charAt(i) < thirdString.charAt(i)) {
					sb.append(firstString);
				}
	    		if (secondString.charAt(i) < firstString.charAt(i) && secondString.charAt(i) < thirdString.charAt(i)) {
					sb.append(secondString);
				}
	    		if (thirdString.charAt(i) < firstString.charAt(i) && thirdString.charAt(i) < secondString.charAt(i)) {
					sb.append(thirdString);
				}
			}*/
	    	
	    }

	}

}
