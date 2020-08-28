package com.core.optionals;

import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Optionals {

	public void testingOptionals() {
		/* empty */
		Optional<String> empty = Optional.empty();

		/* non null value */
		Optional<String> str = Optional.of("Hello");

		/* nullable */
		String nullableString = "";
		Optional<String> str2 = Optional.ofNullable(nullableString);

		if (str.isPresent()) {
			String value = str.get();
		}

		str.ifPresent(value -> System.out.print("Optional is not null: " + value));

		OptionalInt maxOdd = IntStream.of(1, 2, 3, 4, 5, 6, 7).filter(n -> n > 8).max();// Ha!!
		int value = maxOdd.isPresent() ? maxOdd.getAsInt() : 0;

		Optional<String> name = Stream.of("One", "Two", "Three", "Four", "Five")
				.max(Comparator.comparingInt(String::length));

		String longest = name.isPresent() ? name.get() : "";

	}

}
