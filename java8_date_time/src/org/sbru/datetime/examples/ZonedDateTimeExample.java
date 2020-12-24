package org.sbru.datetime.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localDate = LocalDateTime.parse("2021/09/23 12:45",
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		// ZoneId newYork = ZoneId.of("America/New_York");
		// ZonedDateTime zonaNy = ZonedDateTime.of(localDate, ZoneOffset.of("-04:00"));
		ZonedDateTime zoneNy = localDate.atZone(ZoneOffset.of("-04:00"));
		System.out.println("Departure time in New York: " + zoneNy);

		// ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZonedDateTime zoneMadrid = zoneNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
		System.out.println("Arrival time to Madrid: " + zoneMadrid);

		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
		System.out.println("Details travel to Spain:");
		System.out.println("Departure NY: " + f.format(zoneNy));
		System.out.println("Arrival Madrid: " + f.format(zoneMadrid));

		ZoneId.getAvailableZoneIds().forEach(System.out::println);
	}
}
