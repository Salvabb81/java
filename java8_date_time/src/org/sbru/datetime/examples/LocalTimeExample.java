package org.sbru.datetime.examples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);
		System.out.println("Hour: " + now.getHour());
		System.out.println("Minutes: " + now.getMinute());
		System.out.println("Secs.: " + now.getSecond());

		LocalTime sixThirty = LocalTime.of(6, 30, 59);
		System.out.println(sixThirty);
		sixThirty = LocalTime.parse("18:30:45");

		System.out.println("sixThirty = " + sixThirty);
		LocalTime sevenThirty = LocalTime.of(6, 30).plus(1, ChronoUnit.HOURS);
		System.out.println("sevenThirty = " + sevenThirty);
		boolean isBefore = LocalTime.of(6, 30, 59).isBefore(LocalTime.parse("07:30"));
		System.out.println("isBefore = " + isBefore);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String nowFormatted = sixThirty.format(df);
		System.out.println(nowFormatted);

		nowFormatted = df.format(now);
		System.out.println("nowFormatted = " + nowFormatted);

		LocalTime max = LocalTime.MAX;
		LocalTime min = LocalTime.MIN;

		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}

}
