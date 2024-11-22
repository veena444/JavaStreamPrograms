package streamPrograms;

import java.util.Arrays;
import java.util.List;
/*
 * Print maximum & minimum number.
 */
public class MaxAndMinNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(12,51,85,92,74,35,2,41);
		
		System.out.println("Maximum no:" + numbers.stream().reduce(Integer::max).get());
		System.out.println("Minimum no:"+numbers.stream().reduce(Integer::min).get());

	}

}
