package com.core.streams.creating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.core.Person;

class ApplyingOperationsTest {

	@Test
	void testDebugging() {
		ApplyingOperations apply = new ApplyingOperations();
		Assertions.assertEquals(20, apply.debuggingAStreamPipeline());
	}

	@Test
	void testForEach() {
		ApplyingOperations apply = new ApplyingOperations();
		Assertions.assertEquals(7500,
				apply.applyingForEachOperation().stream().filter(Person::isFemale).findFirst().get().getSalary());
	}

	@Test
	void testMaps() {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(9);
		ApplyingOperations apply = new ApplyingOperations();
		Assertions.assertEquals(numbers, apply.applyingMapOperation());

		Stream.of(1, 2, 3).map(n -> Stream.of(n, n * n)).forEach(e -> e.forEach(System.out::println));

		Stream.of(1, 2, 3).flatMap(n -> Stream.of(n, n * n)).forEach(System.out::println);

	}

	@Test
	void testFilters() {

		Stream.of(1, 2, 3, 4, 5, 6, 7, 8);

	}

}
