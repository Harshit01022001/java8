package NewJava;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPrediccatDemo {

	public static void main(String[] args) {
		
		BiPredicate<String, Integer> bp1 = (str,num) -> str.length()==num;
		System.out.println(bp1.test("Harshit", 7));
		
		BiFunction<String, String, Integer> bf = (x,y)-> x.length()+y.length();
		System.out.println(bf.apply("Hallo", "Harshit"));
		
		BiConsumer<Integer, Integer> bc = (x,y)->{
			System.out.println(x+y);
		};
		bc.accept(5, 9);

	}

}
