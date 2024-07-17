package coding.practice.java8.features;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

public class DateTimeDemo {

	/*
	 * New date Time API in java 8 Issue with earlier version of java - 1...... Date
	 * dt = new Date(); we have two option java.sql and java.util it create some
	 * sort of confusion 2...... If we want to format we need to import one more
	 * package as java.text 3...... All the Date claeese was not thread safe means multiple thread In
	 * Java 8 date - Thread safe earlier version of java it is not thread safe
	 * mew date time api is immutable
	 * localDate, localDateTime etc.
	 */

	public static void main(String[] args) {
		System.out.println("DateTimeDemo !!");

		System.out.println("-------- Localdate and time-----------");
		LocalDate d = LocalDate.now();
		System.out.println("LocalDate -> " + d);

		LocalDateTime dt = LocalDateTime.now();
		System.out.println("LocalDateTime -> " + dt);

		System.out.println("-------- Birthday -----------");
		d = LocalDate.of(1977, 8, 3);
		System.out.println("My Birthday -> " + d);

		System.out.println("-------- Leap year -----------");
		try {
			d = LocalDate.of(1977, Month.FEBRUARY, 29);
			System.out.println("Leap year Feb -> " + d);
		} catch (Exception e) {
			System.out.println("Exception -> " + e);
		}
		/*
		 * will get exception as Exception in thread "main" java.time.DateTimeException:
		 * Invalid date 'February 29' as '1977' is not a leap year
		 */
		System.out.println("-------- Localtime -----------");
		LocalTime t = LocalTime.now();
		System.out.println("Localtime ->" + t);

		System.out.println("-------- Get all the Zone -----------");

		for (String s : ZoneId.getAvailableZoneIds()) {
			 System.out.println(s);
		}
		t = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println("Localtime at Asia/Kuwait ->" + t);

		t = LocalTime.now(ZoneId.of("GMT"));
		System.out.println("GMT ->" + t);

		System.out.println("-------- Instant -----------");
		Instant i = Instant.now();
		System.out.println("Instant " + i);

		System.out.println("-------- Date time -----------");
		dt = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println("GMT ->" + dt);
	}

}
