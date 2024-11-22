package streamPrograms;

import java.util.Arrays;
import java.util.List;

/*
 * Print the average of all numbers
 */
public class AverageOfNumbers {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10,20,30,40,50);
		System.out.println(intList.stream().mapToInt(i -> i).average().getAsDouble());

	}

}
