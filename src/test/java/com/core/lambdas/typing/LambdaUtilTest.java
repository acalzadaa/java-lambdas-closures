package com.core.lambdas.typing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdaUtilTest {

	@Test
	void testAdder() {
		LambdaUtil util = new LambdaUtil();
		Assertions.assertEquals(333.33, util.testAdder((x, y) -> x + y));
	}

	@Test
	void testJoiner() {
		LambdaUtil util = new LambdaUtil();
		Assertions.assertEquals("HolaMundo", util.testJoiner((x, y) -> x + y));
		Assertions.assertEquals("Hola Mundo", util.testJoiner((x, y) -> x + " " + y));
		Assertions.assertEquals("HOLA MUNDO", util.testJoiner((x, y) -> x.toUpperCase() + " " + y.toUpperCase()));
	}

}
