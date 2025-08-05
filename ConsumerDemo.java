package NewJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		//Consumer<String> c = s->System.out.println(s);
		//c.accept("Harshit");
		Consumer<List<Integer>> list = li ->
		{
			for(Integer i:li)
			{
				System.out.println(i+100);
			}
		};
		Consumer<List<Integer>> list2 = li->{
			for(Integer i : li) {
				System.out.println(i);
			}
		};
		list2.andThen(list).accept(Arrays.asList(1,2,3,4));
		
		Consumer<List<Integer>> result = list2.andThen(list);
		result.accept(Arrays.asList(5,6,7,8));

	}

}
