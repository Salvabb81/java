package org.sbru.datetime.examples;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationExample {

	public static void main(String[] args) {
		LocalDateTime date1 = LocalDateTime.now();
		// date1 = date1.withMonth(10);
		LocalDateTime date2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
		Duration lapsus = Duration.between(date1, date2);
		System.out.println("lapsus = " + lapsus);
		System.out.println(lapsus.toMinutes());
		System.out.println("we add 5 hours " + lapsus.plusHours(5));
	}
}
