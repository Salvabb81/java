package org.sbru.datetime.examples;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2011, 9, 23);
		LocalDate date2 = LocalDate.of(2020, 11, 25);
		LocalDate date3 = date2.withMonth(12);
		date3 = date3.withDayOfMonth(28);

		Period period = Period.between(date1, date3);

		System.out.println(period);
		System.out.printf("Period between %s and %s there is %d years, %d months y %d days", date1, date3,
				period.getYears(), period.getMonths(), period.getDays());
	}
}
