package NewJava;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
//		Supplier<Integer> sp = ()->1;
//		System.out.println(sp.get());
		
		Predicate<Integer>p1 = x -> x% 2==0;
		Function<Integer, Integer> f1 =x -> x*x;
		Consumer<Integer> c1 = x->System.out.println(x);
		Supplier<Integer> s1 = ()->100;
		
		if(p1.test(s1.get())) {
			c1.accept(f1.apply(s1.get()));
		}
		

	}

}
