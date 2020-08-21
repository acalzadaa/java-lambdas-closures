package com.core.lambdas;

import java.util.function.Function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdasChainedTest {

	@Test
	void testLambdasChained() {
		LambdasChained chain = new LambdasChained();

		Function<Integer, Integer> squareAddOne = chain.square.andThen(chain.addOne);
		Function<Integer, Integer> addOneSquare = chain.square.compose(chain.addOne);

		Assertions.assertEquals(10, squareAddOne.apply(3));
		Assertions.assertEquals(16, addOneSquare.apply(3));

	}

}
