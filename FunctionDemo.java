package NewJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> function1 = x-> x.length();
		System.out.println(function1.apply("Harshit"));
		Function<String, String> function2 = a-> a.substring(0,3);
		System.out.println(function2.apply("Harshit"));
		Function<List<Student>, List<Student>> function3 = li ->{
			List<Student> result =new ArrayList<>();
			for(Student s:li)
			{
				if(function2.apply(s.getName()).equalsIgnoreCase("vip"))
				{
					result.add(s);
				}
			}
			return result;
		};
		Student s1 = new Student(2,"vipul");
		Student s2 = new Student(2,"vipulav");
		Student s3 = new Student(2,"arnav");
		List<Student> students = Arrays.asList(s1,s2,s3);
		List<Student> fi = function3.apply(students);
		System.out.println(fi);

	}



private static class Student
{
	public int id;
	public String name;
	
	
	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return this. id + " : " + this.name;
	}
	
}
	
	
}
