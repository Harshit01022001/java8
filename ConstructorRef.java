package NewJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConstructorRef {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Raman","Harshit","Rahul","Aman");
		List<Student> st= list.stream().map(x->new Student(x)).collect(Collectors.toList());
		List<Student>st1= list.stream().map(Student::new).collect(Collectors.toList());
		System.out.println(st1);

	}
	
	
	 static class Student
	{
		private String name;
	


	public Student(String name) {
			this.name=name;
		}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	
	
	}
	

}
