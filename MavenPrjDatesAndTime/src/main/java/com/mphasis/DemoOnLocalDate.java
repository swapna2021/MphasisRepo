package com.mphasis;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDate {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfWeek());
		
		LocalDate mydate=LocalDate.of(2025,6,23);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is "+today.plusDays(3));
		System.out.println("5 days before today is "+today.minusDays(5));
		
		LocalDate date1=LocalDate.of(2023, 5, 15);
		LocalDate date2=LocalDate.of(2020, 7, 24);
		System.out.println(date1.isBefore(date2));
		
		//converting string to local date
		String strDate="2024-04-19";
		LocalDate ldate=LocalDate.parse(strDate);
		System.out.println(ldate);
		
		//converting localdate to sql date
		Date sqlDate=java.sql.Date.valueOf(ldate);
		
		//converting localdate to util date
		//write code here
		
		
		//converting locacl date to a given format 
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		String formatted=today.format(df);
		System.out.println(formatted);
		
		 today=LocalDate.now();
		 LocalDate dob=LocalDate.of(1981, 06, 26);
		 Period p=Period.between(dob,today);
//		 System.out.println(p);
		 System.out.println("My age is "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days ");
		 
	}

}
