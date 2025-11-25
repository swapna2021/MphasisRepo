package com.mphasis;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZonedDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		System.out.println(dateTime.getOffset());
		System.out.println(dateTime.getZone());
		//complete all getMethods on zonedatetime
		
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(regionDateTime);
		System.out.println(dateTime);
		
		
//		Duration diff=Duration.between(dateTime.toInstant(), regionDateTime.toInstant());
		int diffSeconds=dateTime.getOffset().getTotalSeconds()-regionDateTime.getOffset().getTotalSeconds();
		int hours=diffSeconds/3600;
		int min=(diffSeconds%3600)/60;
		System.out.println("Difference is : "+hours+" hours "+min+" minutes");
		
		
		//converting localdate to zoneddatetime
		
		LocalDateTime dateTime2=LocalDateTime.now();
		ZonedDateTime zonedDateTime=dateTime2.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.toLocalDateTime());//zonedDateTime to LocalDateTime
		
		//convert indian time to us time
		
		ZonedDateTime indiaTime=zonedDateTime.now();
		ZonedDateTime usaTime=indiaTime.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(indiaTime);
		System.out.println(usaTime);
		
		
		//print zonedatetime in the specific pattern
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm a z");
		String formattedZonedDateTime=indiaTime.format(df);
		System.out.println(formattedZonedDateTime);
		System.out.println(regionDateTime.format(df));
		
		
	}

}
