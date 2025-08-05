package NewJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		
		List<String> lt = Arrays.asList("Raman","Aman","Harshit","Raghav");
		Stream<String>stream=lt.stream();
		
		String[] array= {"Apple","Banana","Chery"};
		Stream<String>stream1=Arrays.stream(array);
		
		Stream<Integer>stream2=Stream.of(1,2,3,4,5);
		
		Stream<Integer>sream4=Stream.iterate(0, n -> n + 1).limit(100);
		
		Stream.generate(() -> (int) Math.random() * 100).limit(5);
		

	}

}
