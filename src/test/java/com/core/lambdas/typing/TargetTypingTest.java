package com.core.lambdas.typing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.core.lambdas.typing.Adder;
import com.core.lambdas.typing.Joiner;

class TargetTypingTest {

	@Test
	void testAdder() {
		Adder adder = (x, y) -> x + y;
		Assertions.assertEquals(9, adder.add(4, 5));
		Assertions.assertEquals(10, adder.add(4.5, 5.5));
	}

	@Test
	void testJoiner() {
		Joiner joiner = (x, y) -> x + y;
		Assertions.assertEquals("UnoDos", joiner.join("Uno", "Dos"));
		Assertions.assertEquals("UnoTres", joiner.join("Uno", "Tres"));
	}

}
