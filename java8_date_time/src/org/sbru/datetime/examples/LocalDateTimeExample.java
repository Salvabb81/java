package org.sbru.datetime.examples;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        dateTime = LocalDateTime.of(2020, Month.DECEMBER, 24, 20, 45, 59);
        System.out.println("dateTime = " + dateTime);
        
        dateTime = LocalDateTime.parse("2020-12-25T21:45:59.821339800");
        System.out.println("dateTime = " + dateTime);

        LocalDateTime dateTime2 = dateTime.plusDays(1).plusHours(3);
        System.out.println("dateTime2 = " + dateTime2);
        System.out.println("dateTime = " + dateTime);
        System.out.println("dateTime3 = " + dateTime.minusHours(5));
        
        Month month = dateTime.getMonth();
        System.out.println("month = " + month);
        
        int day = dateTime.getDayOfMonth();
        System.out.println("day: " + day);

        int year = dateTime.getYear();
        System.out.println("year = " + year);
        
        String format1 = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("format1 = " + format1);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        String format2 = dateTime.format(df);
        System.out.println("format2 = " + format2);
        
        String format3 = df.format(dateTime);
        System.out.println("format3 = " + format3);
	}
	
}
