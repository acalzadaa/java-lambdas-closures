package com.core.lambdas.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MethodReferencesTest {

	@Test
	void testMethodReferences() {
		MethodReferences method = new MethodReferences();
		assertEquals("100", method.func1.apply(4));
		assertEquals("100", method.func2.apply(4));
		assertEquals(10, method.func3.apply(6, 4));
		assertEquals(10, method.func4.apply(3, 7));

		assertEquals(15, method.valueOfInt.apply(15));
		assertEquals(15, method.valueOfString.apply("15"));
		assertEquals(15, method.valueOfStringAndRadix.apply("1111", 2));

	}

}
