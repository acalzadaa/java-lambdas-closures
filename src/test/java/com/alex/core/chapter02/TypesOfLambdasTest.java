package com.alex.core.chapter02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TypesOfLambdasTest {

	TypesOfLambdas lambdas = new TypesOfLambdas();

	@Test
	void testWithOutArguments() {
		Assertions.assertEquals(lambdas.withOutArguments("Alex"), "Mi nombre es: Alex");
		Assertions.assertEquals(lambdas.withOutArguments(""), "Mi nombre es: anonimo");

	}

	@Test
	void testMultiStatement() {
		Assertions.assertEquals(lambdas.multiStatement("Hola", "Mundo"), "Hola Mundo");

	}

	@Test
	void testAdding() {
		Assertions.assertEquals(lambdas.adding(2L, 3L), 5);
	}

	@Test
	void testAddingExplicit() {
		Assertions.assertEquals(lambdas.adding(2L, 3L), 5);
	}

	@Test
	void testIsAtLeast5() {
		Assertions.assertEquals(lambdas.isAtLeast5(7), true);
		Assertions.assertEquals(lambdas.isAtLeast5(5), true);
		Assertions.assertEquals(lambdas.isAtLeast5(4), false);

	}

}
