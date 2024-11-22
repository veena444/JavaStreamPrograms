package streamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
 * Print the numbers whose prefix starts with 2 or -2.
 */
public class NumberStartsWith {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,232,569,-245,289,20,742,222,342,0,25,-24);
		
		System.out.println(numbers.stream()
		          .map(e -> String.valueOf(e))
		               .filter(e -> e.startsWith("2") || e.startsWith("-2"))
		                  .map(Integer :: valueOf)
		                     .collect(Collectors.toList()));

	}

}
