package com.core.functional.interfaces.predicates;

import java.util.function.Predicate;

public class Predicates {

	Predicate<Integer> greaterThanTen = x -> x > 10;
	Predicate<Integer> divisibleByThree = x -> x % 3 == 0;
	Predicate<Integer> divisibleByFive = x -> x % 5 == 0;
	Predicate<Integer> equalToTen = Predicate.isEqual(null);

	Predicate<Integer> lessThanOrEqualToTen = greaterThanTen.negate();
	Predicate<Integer> divisibleByThreeAndFive = divisibleByThree.and(divisibleByFive);
	Predicate<Integer> divisibleByThreeOrFive = divisibleByThree.or(divisibleByFive);
}
