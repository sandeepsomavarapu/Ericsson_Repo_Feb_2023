package com.ericcson.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateApiEx {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();// imuttable
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date);
		System.out.println(date.plusDays(3));// imuttable
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		time.plusHours(3);
		System.out.println(time);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getSecond());
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getMonth());
		dateTime.plusHours(3);
		System.out.println(dateTime);

		LocalDateTime dateTime1 = LocalDateTime.of(1993, 8, 10, 10, 45);
		System.out.println(dateTime1);

		LocalDate bDate = LocalDate.of(1993, 11, 10);
		Period p = Period.between(bDate, date);
		System.out.printf("ur age %d years,%d months,%d days", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		ZoneId zone = ZoneId.of("America/New_York");
		ZonedDateTime zt = ZonedDateTime.now(zone);
		System.out.println(zt);// Asia/Calcutta
	}

}
