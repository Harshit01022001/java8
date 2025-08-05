package NewJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,5,6,9,4,2,76,44,654,23545,224,245,654,24,65,433,45,66,55,33,98);
		List<Integer>filteredlist=list.stream().filter(x->x%2==0)
				.map(x-> x/5)
				.distinct()
				.sorted((a,b)->b-a)
				.limit(5)				
				.skip(1)
				.collect(Collectors.toList());
//		List<Integer>maplist=filteredlist.stream().map(x->x/2).collect(Collectors.toList());
	System.out.println(filteredlist);
		
		
		List<Integer>collect=Stream.iterate(0, x->x+1)
				.limit(101)
				.skip(1)
				.filter(x->x%2==0)
				.map(x->x/10)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(collect);
		
	//	Integer integer=Stream.iterate(0, x-> x+1).limit(101).map(x->x/20).distinct().peek(System.out::println).max((a,b)->a-b).get();
	//	System.out.println(integer);
		
		
		long integer1=Stream.iterate(0, x-> x+1).limit(101).map(x->x/20).distinct().count();
		System.out.println(integer1);
	

	}

}
