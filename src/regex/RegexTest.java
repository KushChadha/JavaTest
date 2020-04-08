package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	private static final String DATE_REGEX = "(http:\\/\\/www\\.|https:\\/\\/www\\.|http:\\/\\/|https:\\/\\/)?[a-z]+([\\.]ihg\\.com)\\/[a-z]+\\/hotels\\/[a-z]{2}\\/[a-z]{2}\\/[a-z]+\\/[a-z]+\\/hoteldetail";
	private static final String STR = "([A-Z0-9][a-z0-9 ]*|[&]|[-])*";
	private static Pattern pattern;
	private static Matcher matcher;

	public static void main(String[] args) {
		getDateElement("https://www.ihg.com/holidayinnexpress/hotels/gb/en/bangkok/bkkrb/hoteldetail");
		getString("As as ");
		/*String s = "AAAAA";
		System.out.println(s.matches("[A-Z]{5,64}"));*/
	}

	public static boolean getDateElement(String date) {
		pattern = Pattern.compile(DATE_REGEX, Pattern.CASE_INSENSITIVE);
		matcher = pattern.matcher(date);
		System.out.println(matcher.matches());
		return matcher.matches();
	}
	
	public static boolean getString(String date) {
		pattern = Pattern.compile(STR);
		matcher = pattern.matcher(date);
		System.out.println(matcher.matches());
		return matcher.matches();
	}

}
