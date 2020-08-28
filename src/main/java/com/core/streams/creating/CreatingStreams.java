package com.core.streams.creating;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {

	public void creatingStreamsFromValues() {
		Stream<String> stream = Stream.of("Hello");

		Stream<String> stream2 = Stream.of("Uno", "Dos", "Tres").filter(word -> word.length() < 4);

		String[] namesArray = { "Ken", "Jeff", "Chris", "Ellen" };
		Stream<String> stream3 = Stream.of(namesArray);

		String namesStr = "Ken,Jeff,Chris,Ellen";
		Stream<String> stream4 = Stream.of(namesStr.split(","));

		Stream<String> stream5 = Stream.<String>builder().add("One").add("Two").add("Three").build();

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> stream6 = builder.add("One").add("Two").add("Three").build();

		IntStream oneToFiveExclusive = IntStream.range(1, 6);// 1,2,3,4,5
		IntStream oneToFiveInclusive = IntStream.rangeClosed(1, 5);// 1,2,3,4,5
	}

	public void creatingStreamsFromFunctions() {

		/* iterate */
		Stream<Integer> returnTenNumbersFromOne = Stream.iterate(1, n -> n + 1).limit(10);
		Stream<Long> returnAllNumbersFromOne = Stream.iterate(1L, n -> n + 1);
		Stream<Long> returnAllOddNumbersFromOne = Stream.iterate(1L, n -> n + 2);

		/* generate */
		Stream.generate(Math::random).limit(5);
	}

	public void creatingStreamsFromArrays() {

		IntStream numbers = Arrays.stream(new int[] { 1, 2, 3 });
		Stream<String> names = Arrays.stream(new String[] { "One", "Two", "Three" });

	}

	public void creatingStreamsFromOtherSources() {
		String str = "5 apples and 10 oranges";
		str.chars().filter(c -> Character.isDigit(c) && Character.isLetter(c));
	}

}
