package java8features;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class HandlingDate {

	public static void main(String[] args) {
		LocalDate currentDate= LocalDate.now();
		System.out.println("Current Date : "+currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println("Current Time : "+currentTime);
		
		LocalDateTime currentTimeDate = LocalDateTime.now();
		System.out.println("Current Date and Time : "+currentTimeDate);
		
		LocalDate date1=LocalDate.of(2000,02,04);
		System.out.println("Date : "+date1);
		LocalDate date= LocalDate.parse("2000-04-27");
		System.out.println("Date : "+date);
		System.out.println("Day of Date : "+date.getDayOfWeek());
		DayOfWeek result=date.getDayOfWeek();
		System.out.println("Month of the Date : "+date.getDayOfMonth());
		System.out.println("days of The Date : "+date.getDayOfYear() );
		System.out.println("Year of The Date : "+date.getYear());
		System.out.println("Month is : "+date.getMonth());
		
		// retriving yesterday and Tommorows date
		LocalDate yesterday=currentDate.minusDays(1);
		System.out.println("Yesterday is : "+yesterday);
		
		LocalDate tomorrow= currentDate.plusDays(1);
		System.out.println("Tomorrow is : "+tomorrow);
		
		//is leap Year
		System.out.println("Is leap Year ? : "+currentDate.isLeapYear());
		
		// changing date AND time formate
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatterDate = currentTimeDate.format(formatter);
		System.out.println("Date(dd-MM-yyyy) format : "+formatterDate);
		
		//Handling Zone
		
		ZonedDateTime zonedDate= ZonedDateTime.now();
		System.out.println("Date With Zone : "+zonedDate);
		System.out.println("Current Zone : "+zonedDate.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo"); //setting tokyo zone
		
		ZonedDateTime tokyoZone=zonedDate.withZoneSameInstant(tokyo);
		System.out.println("Date (tokyo zone) : "+tokyoZone);
		
		
		// Callender
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, 04-1);
		cal.set(Calendar.DAY_OF_MONTH, 27);
		cal.set(Calendar.YEAR, 2000);
		String[] day_of_week = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY","SATURDAY"};
		System.out.println(day_of_week[cal.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
// H.W
// retriving Yesterday and Tomoorow Date
