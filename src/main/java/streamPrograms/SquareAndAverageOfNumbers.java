package streamPrograms;

import java.util.Arrays;
import java.util.List;

/*
 * Find the square of each number, then calculate the average.
 */
public class SquareAndAverageOfNumbers {

	public static void main(String[] args) {
	List<Integer> intList =	Arrays.asList(1,2,3,4,5);
	System.out.println(intList.stream().map(i -> i*i).mapToInt(i -> i).average().getAsDouble());

	}

}

//1+4+9+16+25=55/5=11