package coding.practice.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first need to check what day is today
		// what day need to find
		// Saturday- last week
		// add 7 ro gt next saturday

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		System.out.println("Today>>" + sdf.format(cal.getTime()));

		Date date = java.util.Calendar.getInstance().getTime();
		System.out.println(date);

		// System.out.println("SUNDAY>>" + cal.SUNDAY);
		// System.out.println("MONDAY>>" + cal.MONDAY);
		// System.out.println("TUESDAY>>" + cal.TUESDAY);
		// System.out.println("WEDNESDAY>>" + cal.WEDNESDAY);
		// System.out.println("THURSDAY>>" + cal.THURSDAY);
		// System.out.println("FRIDAY>>" + cal.FRIDAY);
		// System.out.println("SATURDAY>>" + cal.SATURDAY);

		// System.out.println("DATE>>" + cal.DATE);
		// System.out.println("DAY_OF_WEEK>>" + cal.DAY_OF_WEEK);
		// System.out.println("DAY_OF_MONTH>>" + cal.DAY_OF_MONTH);

		// System.out.println("DAY_OF_YEAR>>" + cal.DAY_OF_YEAR);

		// cal.add(Calendar.DATE, -7);
		// setToDate(); setFromDate()

		// sdf.format(cal.getTime());
		// setToDate(sdf.format(cal.getTime()));
		// System.out.println("last strdy >>" + sdf.format(cal.getTime()));
		cal.add(Calendar.DATE, -6);

		// Date dt = java.util.Calendar.getInstance().getTime();
		// System.out.println(dt.getDay() + ">>" + dt.getDate() + ">>" + dt.getMonth());


		// sdf.format(cal.getTime());
		// setFromDate(sdf.format(cal.getTime()));
		// System.out.println("Todate>>" + sdf.format(cal.getTime()));

		int daysBackToSat = cal.get(Calendar.DAY_OF_WEEK);
		// System.out.println("daysBackToSat>>" + daysBackToSat);

		// cal.add(Calendar.DATE, -daysBackToSat);
		cal.add(Calendar.DATE, daysBackToSat * -1);
		// System.out.println(sdf.format(cal.getTime()));

		// System.out.println("Last Sat>>" + sdf.format(cal.getTime()));

	}

	private static void setFromDate(String format) {
		// TODO Auto-generated method stub

	}

	private static void setToDate(String format) {
		// TODO Auto-generated method stub

	}


}
