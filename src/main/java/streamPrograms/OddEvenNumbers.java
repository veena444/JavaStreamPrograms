package streamPrograms;

import java.util.Arrays;
import java.util.List;

/*
 * Print even & odd numbers.
 */
public class OddEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,51,85,92,74,35,2,41);
		
		System.out.println("Even numbers:" +numbers.stream().filter(i -> i%2 == 0).toList());
		System.out.println("Odd numbers:" +numbers.stream().filter(i -> i%2 != 0).toList());

	}

}
