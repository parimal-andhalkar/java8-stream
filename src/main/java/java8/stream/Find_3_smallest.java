package java8.stream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Find_3_smallest {

	public static void main(String[] args) {
		int[] numbers = { 4, 12, 7, 6, 65, 43, 21, 1, 67, 32, 1, 2, 4 };

		IntStream.of(numbers).distinct().sorted().limit(3).forEach(System.out::println);

		// ---------------- 3 operations
		// ---------------------------------------------------
		/*
		 * 1. create 2. Process 3. Consume
		 */

		IntStream.range(1, 100).forEach(System.out::println);
		IntStream stream = IntStream.rangeClosed(2, 200);
		// IntStream.generate(supplier);

		Stream<Integer> boxed = stream.boxed(); // Convert each primitive int to Integer (Autoboxing)
		IntStream skip = stream.skip(3);
		IntStream map = stream.map(num -> num * 2);
		IntStream filter = stream.filter(num -> num % 2 == 0);
		List<Integer> list = stream.boxed().collect(Collectors.toList());

		int[] array = stream.toArray();
		boolean anyMatch = stream.anyMatch(num -> num % 2 == 1);
		boolean allMatch = stream.allMatch(num -> num % 2 == 1);

	}
}
