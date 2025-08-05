package NewJava;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		//System.out.println(today);
		LocalDate custom=LocalDate.of(2001, 02, 01);
		//System.out.println(custom);
		
		int d=today.getDayOfMonth();
		DayOfWeek d1=today.getDayOfWeek();
		Month m =today.getMonth();
		int y1=today.getYear();
//		System.out.println(d);
//		System.out.println(d1);
//		System.out.println(m);
//		System.out.println(y1);
//		
		
		
		LocalDate yesterday=today.minusDays(1);
		LocalDate pastday=today.minusMonths(100);
		LocalDate pastyear =today.minusYears(100);
		System.out.println(today);
		System.out.println(yesterday);
		System.out.println(pastday);
		System.out.println(pastyear);
		if(today.isAfter(yesterday))
		{
			System.out.println("Yes Bro!!!");
		}
		

	}

}
