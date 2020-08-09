package com.alex.core.chapter01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LambdasChainedTest {

	@Test
	void test() {
		Lambdas lambdas = new Lambdas();
		LambdasChained lambdaschain = new LambdasChained();

		// this lambda
		assertEquals(lambdaschain.func.apply(6), 12);
		assertEquals(lambdaschain.func.apply(0), 0);

		// the other lambda
		assertEquals(lambdas.func.apply("Alex"), 4);
		assertEquals(lambdas.func.apply("Sam"), 3);

		// chained lambdas
		assertEquals(lambdas.func.andThen(lambdaschain.func).apply("alex"), 8);

	}

}
