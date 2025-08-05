package NewJava;

public class Anonimous {

	public static void main(String[] args) {
		Employee1 emp = new Employee1() {

			@Override
			public int getSalary() {
				// TODO Auto-generated method stub
				return 100;
			}

//			@Override
//			public String getDesignation() {
//				// TODO Auto-generated method stub
//				return "Software Engineer";
//			}
			
		};
		System.out.println(emp.getSalary());
	//	System.out.println(emp.getDesignation());

	}

}
