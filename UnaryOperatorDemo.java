package NewJava;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		Function<String, String> f1 = x-> x.toUpperCase();  // input String and output String
		Function<Integer, Integer>f2 = x-> x * x;   //input Integer and output Integer
		
		/// if u use UnaryOperator then define data type String that return also string automaticaly
		
		UnaryOperator<String> u1 = str-> str.toUpperCase();  // special case of function
		System.out.println(u1.apply("harshit"));
		
		BinaryOperator<String> bo1 = (str1,str2)-> str1+str2;
		System.out.println(bo1.apply("Hello ", "Java"));

	}

}
