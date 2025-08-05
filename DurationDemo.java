package NewJava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Instant start = Instant.now();
		int sum =0;
		
		for(int i=0;i<10000;i++)
		{
			sum +=i+1;
		}
		Instant end = Instant.now();
		Duration d1=Duration.between(start, end);
		Duration d2 =Duration.of(1, ChronoUnit.MILLIS);
		System.out.println(d1);
		System.out.println(d2);
		int i=d1.compareTo(d2);
		System.out.println(i);
		
		LocalDateTime dt = LocalDateTime.now();
		Thread.sleep(2000);
		LocalDateTime dt1 = LocalDateTime.now();
		Duration d=Duration.between(dt, dt1);
		System.out.println(d);
		

	}

}
