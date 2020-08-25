package com.core.lambdas.method;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GenericReferencesTest {

	@Test
	void test() {
		GenericReferences generic = new GenericReferences();
		String[] test = { "a", "b", "c" };
		List<String> testArray = new ArrayList<>();
		testArray.add("a");
		testArray.add("b");
		testArray.add("c");

		Assertions.assertEquals(testArray, generic.asList.apply(test));
	}

}
