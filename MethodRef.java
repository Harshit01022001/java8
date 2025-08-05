package NewJava;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	public void hello(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		MethodRef cr = new MethodRef();
		
		List<String> list = Arrays.asList("Raman","Harshit","Rahul","Aman");
		list.forEach(MethodRef::print);  //method reference
		list.forEach(x->System.out.println(x)); // both are the doing same work
		
		list.forEach(cr::hello);
		

	}

}
