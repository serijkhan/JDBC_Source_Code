package dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class NewDate {
	public static void main(String[] args) {
		LocalDate of = LocalDate.of(2021, 1, 20);
		System.out.println(of);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(3);
		System.out.println(date);
		
		date= date.plusMonths(1);
		System.out.println(date);
		
		date = date.plusYears(2);
		System.out.println(date);
		
		boolean LeapYear = LocalDate.parse("2022-12-22").isLeapYear();
		System.out.println("Leap Year::"+LeapYear);
		
		boolean before =  LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println("Before Date:"+before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		time = time.plusHours(2);
		System.out.println(time);
		
		LocalDateTime datetime = LocalDateTime.now();
		System.out.println(datetime);
		
		Period period = Period.between(LocalDate.parse("1991-05-20"), LocalDate.now());
		System.out.println(period);
		
		Duration duration = Duration.between(LocalTime.parse("18:00"), LocalTime.now());
		System.out.println(duration);
		
		
	}

}
