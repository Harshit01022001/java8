package NewJava;

public class Anonimous1 {
	
	int a=2;                          // this is a instance variable

	public static void main(String[] args) {
		doSomething();
	}	
		private static void doSomething() {
			
			int a=3;                        // this is a local variable
			Employee1 emp = ()->{
				
				return 100;
			};
			System.out.println(emp.getSalary());
		}
		
		Employee1 emp1 = new Employee1() {

			int a=4;                     // this is a instance variable because employee1 is a saprate class
			@Override
			public int getSalary() {
				System.out.println(this.a);
				return 200;
			}
			
		};
}
