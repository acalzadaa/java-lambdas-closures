package com.core.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercises {
	/*
	 * 1. Method references. Take a look back at the examples in Chapter 3 and try
	 * rewriting the following using method references:
	 * 
	 * a. The map to uppercase
	 * 
	 */

	public List<String> example1(ArrayList<String> names) {
		return names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
	}

	/*
	 * b. The implementation of count using reduce
	 **/

	public long example2(ArrayList<Integer> numbers) {
		return numbers.stream().collect(Collectors.counting()).longValue();
	}

	/*
	 * c. The flatMap approach to concatenating lists
	 */

	/*
	 * 2. Collectors.
	 * 
	 * a. Find the artist with the longest name. You should implement this using a
	 * Collector and the reduce higher-order function from Chapter 3. Then compare
	 * the differences in your implementation: which was easier to write and which
	 * was easier to read? The following example should return "Stuart Sutcliffe":
	 * Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George
	 * Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");
	 */

	public String example4() {
		Stream<String> names = Stream.of("John Lennon", "Paul McCartney", "George Harrison", "Ringo Starr", "Pete Best",
				"Stuart Sutcliffe");
		return names.filter(name -> name.startsWith("Stuart")).toString();
	}

	/*
	 * b. Given a Stream where each element is a word, count the number of times
	 * each word appears. So, if you were given the following input, you would
	 * return a Map of [John → 3, Paul → 2, George → 1]:
	 * 
	 * Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul",
	 * "John");
	 */

	public Map<String, Long> example5() {
		Stream<String> names = Stream.of("John", "Paul", "George", "John", "Paul", "John");
		return names.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}

	/*
	 * c. Implement Collectors.groupingBy as a custom collector. You don’t need to
	 * provide a downstream collector, so just implementing the simplest variant is
	 * fine.
	 * 
	 * If you look at the JDK source code, you’re cheating!
	 * 
	 * Hint: you might want to start with public class GroupingBy<T, K> implements
	 * Collector<T, Map<K, List<T>>, Map<K, List<T>>>. This is an advanced exercise,
	 * so you might want to attempt it last.
	 * 
	 * 3. Map enhancements. Efficiently calculate a Fibonacci sequence using just
	 * the computeIfAbsent method on a Map. By “efficiently,” I mean that you don’t
	 * repeatedly recalculate the Fibonacci sequence of smaller numbers.
	 */

}
