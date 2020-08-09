package com.alex.core.chapter01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LambdasTest {

	@Test
	void test() {
		Lambdas lambdas = new Lambdas();

		assertEquals(lambdas.func.apply("Alex"), 4);
		assertEquals(lambdas.func.apply("Conny"), 5);
		assertEquals(lambdas.func.apply("Sam"), 3);
	}

}
