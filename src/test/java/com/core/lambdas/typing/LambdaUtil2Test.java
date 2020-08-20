package com.core.lambdas.typing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdaUtil2Test {

	@Test
	void testAdder() {
		LambdaUtil2 util2 = new LambdaUtil2();
		Assertions.assertEquals(333.33, util2.test((Adder) (x, y) -> x + y));
	}

	@Test
	void testJoiner() {
		LambdaUtil2 util2 = new LambdaUtil2();
		Assertions.assertEquals("HelloWorld", util2.test((Joiner) (x, y) -> x + y));
		Assertions.assertEquals("Hello World", util2.test((Joiner) (x, y) -> x + " " + y));
		Assertions.assertEquals("HELLO WORLD", util2.test((Joiner) (x, y) -> x.toUpperCase() + " " + y.toUpperCase()));
	}

}
