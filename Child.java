package NewJava;

interface Parent
{
	default void seyHello()
	{
		System.out.println("Hello");	
	}
}

public class Child implements Parent {
	
	@Override
	public void seyHello()
	{
		System.out.println("Hello java 8");
	}

	public static void main(String[] args) {
		System.out.println("Helow java");
		
		Child c = new Child();
		c.seyHello();

	}

}
