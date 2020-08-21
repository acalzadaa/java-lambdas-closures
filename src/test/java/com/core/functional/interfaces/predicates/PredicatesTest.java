package com.core.functional.interfaces.predicates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PredicatesTest {

	@Test
	void testPredicates() {
		Predicates predicate = new Predicates();
		Assertions.assertEquals(false, predicate.divisibleByFive.test(6));
		Assertions.assertEquals(true, predicate.divisibleByFive.test(5));
		Assertions.assertEquals(false, predicate.divisibleByThree.test(5));
		Assertions.assertEquals(true, predicate.divisibleByThree.test(6));

		Assertions.assertEquals(true, predicate.divisibleByThree.and(predicate.divisibleByFive).test(15));
		Assertions.assertEquals(true, predicate.divisibleByThreeAndFive.test(15));

		Assertions.assertEquals(true, predicate.divisibleByThree.or(predicate.divisibleByFive).test(6));
		Assertions.assertEquals(true, predicate.divisibleByThree.or(predicate.divisibleByFive).test(10));

		Assertions.assertEquals(false, predicate.equalToTen.test(11));
		Assertions.assertEquals(true, predicate.equalToTen.negate().test(11));

		Assertions.assertEquals(true, predicate.greaterThanTen.test(11));
		Assertions.assertEquals(false, predicate.lessThanOrEqualToTen.test(11));

	}

}
