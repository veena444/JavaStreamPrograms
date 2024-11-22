package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * Print the duplicate numbers.
 */
public class DuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,10,50,20,10,20,45,2,30,0);
		
		//approach 1
//		System.out.println(numbers.stream().filter(e ->Collections.frequency(numbers, e)>1).collect(Collectors.toSet()));
		
		//approach 2
		
		Set<Integer> duplicateNums =new HashSet<Integer>();
		System.out.println(numbers.stream().filter(e -> !duplicateNums.add(e)).collect(Collectors.toSet()));

	}

}
