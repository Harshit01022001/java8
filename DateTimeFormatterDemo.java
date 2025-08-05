package NewJava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

	

	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		DateTimeFormatter myformat=DateTimeFormatter.ofPattern("DD/MM/YYYY");
		String localDate= dt.format(myformat);
		System.out.println(localDate);
		
		
		
		String date = "01/02/2001";
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parse =LocalDate.parse(date,d);
		System.out.println(parse);

	}

}
