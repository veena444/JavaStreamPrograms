package streamPrograms;

import java.util.Arrays;
import java.util.List;

/*
 * Print 1st 5 numbers & last 5 numbers from the given list.
 */
public class PrintFirst5Numbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,70,80,90);
		
	// 1st 5 numbers
		
	System.out.println(numbers.stream().limit(5).toList());
	
	//sum of 1st 5 numbers
	
	System.out.println(numbers.stream().limit(5).mapToInt(e -> e).sum());
		
	// last 5 numbers
	
	System.out.println(numbers.stream().skip(4).toList());
	
	//sum of last 5 numbers
	
	System.out.println(numbers.stream().skip(4).mapToInt(e -> e).sum());

	}

}
