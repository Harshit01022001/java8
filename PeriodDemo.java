package NewJava;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDate ld1 = LocalDate.of(1998, 7, 31);
		Period p = Period.between(ld, ld1);
		System.out.println(p);

	}

}
