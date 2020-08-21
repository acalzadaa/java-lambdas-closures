package com.core.lambdas.method;

import java.util.function.Consumer;
import java.util.function.Supplier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoundReceiverTest {

	@Test
	void test() {
		Supplier<Integer> supplier = () -> "Hola".length();
		Assertions.assertEquals(4, supplier.get());

		Supplier<Integer> supplier2 = "Hola"::length;
		Assertions.assertEquals(4, supplier2.get());

		Consumer<String> consumer = str -> System.out.println(str);
		consumer.accept("Hello");

	}

}
