package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Find 2nd lowest & 2nd highest numbers.
 */
public class FindSecondLowestAndHighestNumber {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40,50,10,20,60,70,80,60,90);
		
		//2nd highest number
		
		System.out.println(numbers.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get());
		
		//2nd lowest number
		
		System.out.println(numbers.stream().sorted().distinct().skip(1).findFirst().get());

	}

}
