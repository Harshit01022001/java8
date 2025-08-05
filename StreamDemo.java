package NewJava;

import java.util.Arrays;
import java.util.stream.IntStream;


public class StreamDemo {

	public static void main(String[] args) {
		
		//imperative approach
		int[] array = {1,2,3,4,5};
		int sum=0;
		for(int i=0; i<array.length;i++){
			if (array[i]%2==0) {
				sum+=array[i]; 
				}
		}
		//stream
		int[] array2= {1,2,3,4,5};
		IntStream sum2 = Arrays.stream(array2).filter(n->n%2==0);
		System.out.println(sum2.sum());
 
	}

}
