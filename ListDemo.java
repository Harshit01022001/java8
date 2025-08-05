package NewJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(2);
		list.add(1);
		list.add(7);
		//Collections.sort(list, new MyClass());
		Collections.sort(list,(a,b)->b-a);  //using lambda expressions
		System.out.println(list);
		

	}

}
