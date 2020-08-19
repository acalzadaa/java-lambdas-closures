package com.core.lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.core.lambdas.Lambdas;

class LambdasTest {

	@Test
	void test() {
		Lambdas lambdas = new Lambdas();

		assertEquals(lambdas.func.apply("Uno"), 3);
		assertEquals(lambdas.func.apply("Dos"), 3);
		assertEquals(lambdas.func.apply("Tres"), 4);

		assertEquals(lambdas.func2.apply(1), 2);
		assertEquals(lambdas.func2.apply(2), 3);

		assertEquals(lambdas.func3.apply(2, 3), 3);
		assertEquals(lambdas.func3.apply(2, 1), 2);
		assertEquals(lambdas.func3.apply(4, 4), 4);

	}

}
