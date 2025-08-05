package NewJava;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstandDemo {

	public static void main(String[] args) {
		long l=System.currentTimeMillis();
		System.out.println(l);
		Instant now=Instant.now();
		System.out.println(now);
		ZonedDateTime i=now.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(i);

	}

}
