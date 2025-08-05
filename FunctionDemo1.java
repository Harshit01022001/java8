package NewJava;

import java.util.function.Function;

public class FunctionDemo1 {

	public static void main(String[] args) {
		
		Function<String,String> f1 = a-> a.toUpperCase();
		Function<String, String> f2 = s-> s.substring(0,3);
		//Function<String, String>value=f1.andThen(f2);
		//System.out.println(value.apply("vipul"));
		System.out.println(f1.andThen(f2).apply("vip"));
		
		Function<Integer, Integer> function1 = x-> 2*x;
		Function<Integer, Integer> function2 = x -> x*x*x;
		System.out.println(function1.andThen(function2).apply(3));  //216
		System.out.println(function2.andThen(function1).apply(3)); //54
		
		System.out.println(function1.compose(function2).apply(3));
		
		
		Function<String, String> st = Function.identity();
		System.out.println(st.apply("Harshit"));

	}

}
