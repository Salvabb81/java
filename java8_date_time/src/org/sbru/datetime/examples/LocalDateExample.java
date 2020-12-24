package org.sbru.datetime.examples;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate currentDate = LocalDate.now();
		System.out.println("currentDate = " + currentDate);
		System.out.println("Día: " + currentDate.getDayOfMonth());
		Month month = currentDate.getMonth();
		System.out.println("Month: " + month);
		System.out.println("Number of the month: " + month.getValue());
		System.out.println("Month in spanish: " + month.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));

		DayOfWeek dayOfTheWeek = currentDate.getDayOfWeek();
		System.out.println("Number of the day: " + dayOfTheWeek.getValue());
		System.out.println("Number of the day: " + dayOfTheWeek.getDisplayName(TextStyle.FULL, new Locale("es", "ES")));
		System.out.println("Year: " + currentDate.getYear());
		System.out.println("Day of the year: " + currentDate.getDayOfYear());
		System.out.println("Era: " + currentDate.getEra());

		currentDate = LocalDate.now();
		System.out.println("Current date: " + currentDate);

		currentDate = LocalDate.of(2020, 12, 24);
		System.out.println("Current date: " + currentDate);

		currentDate = LocalDate.of(2020, Month.DECEMBER, 24);
		System.out.println("Current date: " + currentDate);

		currentDate = LocalDate.parse("2020-12-24");
		System.out.println("Current date: " + currentDate);

		LocalDate tmrDay = LocalDate.now().plusDays(1);
		System.out.println("Tomorrow's day: " + tmrDay);

		LocalDate lastMonthSameDay = LocalDate.now().minusMonths(1);
		System.out.println("Last month same day: " + lastMonthSameDay);

		LocalDate lastMonthSameDay2 = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		System.out.println("Last month same day: " + lastMonthSameDay2);

		DayOfWeek thursday = LocalDate.parse("2020-12-24").getDayOfWeek();
		System.out.println("thursday = " + thursday);

		int twentyfour = LocalDate.of(2020, 12, 24).getDayOfMonth();
		System.out.println(twentyfour);

		boolean isLeapYear = LocalDate.now().isLeapYear();
		System.out.println("isLeapYear = " + isLeapYear);

		boolean isBefore = LocalDate.of(2020, 12, 24).isBefore(LocalDate.parse("2020-12-24"));
		System.out.println("isBefore = " + isBefore);

		boolean isAfter = LocalDate.parse("2020-12-24").isAfter(LocalDate.parse("2020-12-24"));
		System.out.println("isAfter = " + isAfter);

		isAfter = LocalDate.now().isAfter(LocalDate.now().minusDays(1));
		System.out.println("isAfter = " + isAfter);
	}
}
