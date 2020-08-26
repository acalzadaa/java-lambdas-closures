package com.core.streams.creating;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreatingStreamsTest {

	@Test
	void testCreatingStreamsFromValues() {
		Stream<String> stream = Stream.of("Hello");
		Assertions.assertEquals(1, stream.count());

		Stream<String> stream2 = Stream.of("One", "Two", "Three").filter(word -> word.length() < 4);
		Assertions.assertEquals(2, stream2.count());

		String[] namesArray = { "Ken", "Jeff", "Chris", "Ellen" };
		Stream<String> stream3 = Stream.of(namesArray).filter(name -> name.endsWith("en"));
		Assertions.assertEquals(2, stream3.count());

		String namesStr = "Ken,Jeff,Chris,Ellen";
		Stream<String> stream4 = Stream.of(namesStr.split(",")).filter(name -> name.endsWith("en"));
		Assertions.assertEquals(2, stream4.count());

		Stream<String> stream5 = Stream.<String>builder().add("One").add("Two").add("Three").build();
		Assertions.assertEquals(3, stream5.count());

		Stream.Builder<String> builder = Stream.builder();
		Stream<String> stream6 = builder.add("One").add("Two").add("Three").build();
		Assertions.assertEquals(3, stream6.count());

		IntStream oneToFiveExclusive = IntStream.range(1, 6);// 1,2,3,4,5
		Assertions.assertEquals(5, oneToFiveExclusive.count());

		IntStream oneToFiveInclusive = IntStream.rangeClosed(1, 5);// 1,2,3,4,5
		Assertions.assertEquals(5, oneToFiveInclusive.count());

	}

}
