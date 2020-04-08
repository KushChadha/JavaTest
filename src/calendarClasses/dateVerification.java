package calendarClasses;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dateVerification {

	public static void main(String[] args) {
		//Variables needed
		String DATE_REGEX= "^[A-Z][a-z]{2}, [A-Z][a-z]{2} [0-3][0-9] - [A-Z][a-z]{2}, [A-Z][a-z]{2} [0-3]{1}[0-9]{1}";
		Pattern pattern;
		Matcher matcher;
		
		pattern = Pattern.compile(DATE_REGEX, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher("Tue, Apr 24 - Tue, Apr 24");
		System.out.println(matcher.matches());
		
		Date date = new Date();
		System.out.println(date);
		
		String d = date.toString().substring(0, 10);
		System.out.println(d);
		
		DateFormat format = new SimpleDateFormat("EEE, MMM dd");
		System.out.println(format.format(date));
		
		DateFormat s = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(s.format(date));
	}

	/*// Validate Date format Hotel Search
	public boolean getDateElement(MobileElement element) {
		pattern = Pattern.compile(DATE_REGEX, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(element.getText());
		return matcher.matches();

	}*/

}
