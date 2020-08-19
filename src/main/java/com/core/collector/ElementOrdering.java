package com.core.collector;

import java.util.List;
import java.util.stream.Collectors;

public class ElementOrdering {

	public List<Integer> orderNumbers(List<Integer> numbers) {
		return numbers.stream().sorted().collect(Collectors.toList());
	}

	public List<Integer> orderNumbersWithMap(List<Integer> numbers) {
		return numbers.stream().map(number -> number + 1).collect(Collectors.toList());
	}

}
