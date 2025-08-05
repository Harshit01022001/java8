package NewJava;

interface a
{
	default void hello()
	{
		System.out.println("Hello java");
	}
}

interface b
{
	default void hello()
	{
		System.out.println("Hello java 8");
	}
}


public class SeyHello implements a,b {

	public static void main(String[] args) {
		SeyHello sh = new SeyHello();
		sh.hello();
		

	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		b.super.hello();
	}

}
