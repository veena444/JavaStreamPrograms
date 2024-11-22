package streamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Sort the numbers in a ascending & descending order.
 */
public class SortNumbers {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(10,20,30,40,50);
		
		System.out.println("Ascending order:"+intList.stream().sorted().toList());
		
		System.out.println("Descending order:"+intList.stream().sorted(Collections.reverseOrder()).toList());

	}

}
