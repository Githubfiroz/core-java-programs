package coding.practice.java8.features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class SunDayNLastSaturday {

	public static void main(String[] args) {
		System.out.println("Today>>" + LocalDate.now().getDayOfWeek());

		System.out.println(LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY)));
		System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));

	}

	public void mainmathod() {

		// getPreviousSaturday();

		// int d = LocalDate.now().getDayOfWeek();
		// t(ChronoField.DAY_OF_WEEK)

//				LocalDate d = LocalDate.now();
//				System.out.println(">>"+d);
//				
//				System.out.println(d.getDayOfWeek());

//				System.out.println(d.atStartOfDay());
//				System.out.println(d.minusDays(3));
		// System.out.println(LocalDate.now().with( next( SUNDAY ) ) );

//				Date today = new Date();
//		        System.out.println("Is Saturday : " + isSaturday(today));
//		        System.out.println("Is Saturday : " + isSaturday(today));
//		        System.out.println("whichDayinWeek : " + whichDayinWeek(today));

//				System.out.println("getCommingSunday : " + getCommingSunday(today));
	}

	public static String getPreviousSaturday() {

		// LocalDate previousSaturday = LocalDate.with( TemporalAdjusters.previous(
		// DayOfWeek.SATURDAY ) ) ;

		System.out.println("Today>>" + LocalDate.now().getDayOfWeek());
		// System.out.println(TemporalAdjusters.previousOrSame( DayOfWeek.SUNDAY ));

		System.out.println(LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY)));

		System.out.println(LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)));

		return "";

	}

	public static String getCommingSunday(final Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int day = cal.get(Calendar.DAY_OF_WEEK);
		if (day == 1)
			return "Sunday";
		else if (day == 2)
			return "Monday";
		else if (day == 3)
			return "Tuesday";
		else if (day == 4)
			return "Wednesday";
		else if (day == 5)
			return "Thursday";
		else if (day == 6)
			return "Friday";
		else
			return "Saturday";
	}

	public static int whichDayinWeek(final Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int day = cal.get(Calendar.DAY_OF_WEEK);
		return day;
	}

	public static boolean isSaturday(final Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int day = cal.get(Calendar.DAY_OF_WEEK);
		return day == Calendar.SATURDAY;
	}

	public static boolean isSunday(final Date d) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);

		int day = cal.get(Calendar.DAY_OF_WEEK);
		return day == Calendar.SUNDAY;
	}

}
