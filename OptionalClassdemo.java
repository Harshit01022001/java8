package NewJava;

import java.util.Optional;

public class OptionalClassdemo {

	public static void main(String[] args) {
		Optional<String> optional = getName(2);
		Optional<Object> tobe = optional.map(x->x.toUpperCase());
		tobe.ifPresent(System.out::println);
			
	

	}
	
	private static Optional<String> getName(int id){
		
		return Optional.of("shayam");
	}

}
