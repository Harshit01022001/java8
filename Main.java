package NewJava;

public class Main {

	public static void main(String[] args) {
		
				Employee emp = ()->"Hello functional Interface using lembda Expression";
				System.out.println(emp.getName());
				
				Employee Editor = ()-> "Hello Editor";
				System.out.println(Editor.getName());
				
				
//	---------------------how to create thread using lambda expression---------------------------------------------
				Runnable rb =()->{
					for(int i=1; i<=10;i++)
					{
						System.out.println("Hello"+i);
					}
				};
				Thread th = new Thread(rb);
				th.run();
				
				
				
				
	}

}
