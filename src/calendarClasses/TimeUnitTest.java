package calendarClasses;

import java.sql.Timestamp;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeUnitTest {
	public static void main(String[] args) {
		long nowTimestamp = new Date().getTime();
		
		Date date = new Date(nowTimestamp + TimeUnit.MILLISECONDS.convert(2, TimeUnit.DAYS));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		FieldPosition pos = new FieldPosition(5);
		StringBuffer buffer = new StringBuffer("T");
		
		System.out.println(date);
		
		System.out.println(dateFormat.format(date));
		
		System.out.println(dateFormat.format(date, buffer, pos));
		
		long time = TimeUnit.DAYS.convert(12, TimeUnit.DAYS);
		System.out.println(time);
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss").format(new Date());
		System.out.println(timeStamp);
		
		Timestamp timestamp = new Timestamp(nowTimestamp + TimeUnit.MILLISECONDS.convert(2, TimeUnit.DAYS));
		Instant instant = timestamp.toInstant();
        System.out.println(instant);
	}
	
}
