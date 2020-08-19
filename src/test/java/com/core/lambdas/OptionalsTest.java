package com.core.lambdas;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OptionalsTest {

	@Test
	void test() {
		Optional<Integer> canBeEmpty1 = Optional.of(5);
		Assertions.assertEquals(canBeEmpty1.isPresent(), true);
		Assertions.assertEquals(canBeEmpty1.get(), 5);

		Optional<Integer> canBeEmpty2 = Optional.empty();
		Assertions.assertEquals(canBeEmpty2.isPresent(), false);

		int x = 0;
		Optional<Integer> canBeEmpty3 = Optional.ofNullable(null);
		Assertions.assertEquals(canBeEmpty3.isPresent(), false);
		canBeEmpty3 = Optional.ofNullable(x);
		Assertions.assertEquals(canBeEmpty3.isPresent(), true);

	}

}
