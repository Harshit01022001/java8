package NewJava;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		ZonedDateTime now =ZonedDateTime.now();
		System.out.println(now);
//		Set<String> zoneid=ZoneId.getAvailableZoneIds();
//		zoneid.forEach(System.out::println);
		//ZonedDateTime newyork=ZonedDateTime.of(2000, 12, 1, 1, 14, 10, 10, ZoneId.of("America/Argentina/Catamarca"));
		//System.out.println(newyork);
		ZonedDateTime newyork =ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyork);

	}

}
