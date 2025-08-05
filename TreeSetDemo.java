package NewJava;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		Set<Integer> s = new TreeSet<>();
		s.add(22);
		s.add(3);
		s.add(5);
		s.add(11);
		s.add(15);
		System.out.println("Before manual sorting"+s);
		Set<Integer> ss = new TreeSet<>((a,b)->b-a);
		ss.add(22);
		ss.add(3);
		ss.add(5);
		ss.add(11);
		ss.add(15);
		System.out.println("Before manual sorting"+ss);
		
		

	}

}
