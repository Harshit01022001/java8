package NewJava;

import java.time.LocalDateTime;

public class LocalDatetimeDemo {

	public static void main(String[] args) {
		LocalDateTime now=LocalDateTime.now();
		System.out.println(now);
		LocalDateTime mytime=LocalDateTime.parse("2023-01-03T13:45");
		
		System.out.println(mytime);

	}

}
