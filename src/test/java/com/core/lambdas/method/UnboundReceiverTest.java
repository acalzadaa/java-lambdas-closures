package com.core.lambdas.method;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnboundReceiverTest {

	@Test
	void test() {
		UnboundReceiver unbound = new UnboundReceiver();
		Assertions.assertEquals(4, unbound.strLengthFunction.apply("hola"));

		Assertions.assertEquals("HelloWorld", unbound.concatFunction.apply("Hello", "World"));

	}

}
