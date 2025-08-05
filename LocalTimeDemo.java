package NewJava;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		LocalTime now=LocalTime.now();
		System.out.println(now);
		LocalTime custom = LocalTime.of(12, 19,50);
		System.out.println(custom);
		LocalTime parseTime= LocalTime.parse("15:30:30");
		LocalTime pastonehr=now.minusHours(1);
		System.out.println(pastonehr);

		if(now.isBefore(pastonehr)) {
			System.out.println("haa bhai!!");
		}
	}

}
