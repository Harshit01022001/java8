package NewJava;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
//		Predicate<Integer> pr = x->x > 10000;
//		System.out.println(pr.test(100000));
		List<Integer> numbres = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		int sum = numbres.stream().filter(n -> n % 2 == 0)
				.mapToInt(n -> n)
				.sum();
		System.out.println(sum);
		
		
		//-----------------------------------------------------------------------
		
		
		Predicate<Integer> prdt = x -> x % 2 == 0;
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
		for(Integer i : numbers1)
		{
			if(prdt.test(i))
			{
				System.out.println(i);
			}
		}
		
		//-----------------------------------------------------------------
		
		Predicate<String> prd = x -> x.toLowerCase().charAt(0) == 'h';
		System.out.println(prd.test("Hello"));
		
		
		
		//-------------------------------------------------------------------------
		
		Predicate<String> prd2 = x -> x !=null && !x.isEmpty() && x.toLowerCase().charAt(x.length()-1) == 't';
		Predicate<String> or = prd2.or(prd2);
		Predicate<String> negate = prd2.negate();
		System.out.println(or.test("Hello"));
		System.out.println(negate.test("Hello"));
		
	//-----------------------------------------------------------------------------
		
		Predicate<Object> prd3 = Predicate.isEqual("Harshit");
		System.out.println(prd3.test("Harsh"));
		
	//------------------------------------------------------------------------------	
		
		Student1 st1 = new Student1("Rahul", 1);
		Student1 st2 = new Student1("Aman", 2);
		Predicate<Student1> std = x -> x.getId()>1;
		System.out.println(std.test(st2));
		
		
	}
	
	
	private static class Student1{
		
		String name;
		int id;
		public Student1(String name, int id) {
			
			this.name = name;
			this.id = id;
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		
		
	}
	
	
	

}
