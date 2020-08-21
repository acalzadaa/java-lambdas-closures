package com.core.lambdas.method;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferences {

	// lambda expression
	Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
	BiFunction<Integer, Integer, Integer> func3 = (x, y) -> Integer.sum(x, y);

	// method reference
	Function<Integer, String> func2 = Integer::toBinaryString;
	BiFunction<Integer, Integer, Integer> func4 = Integer::sum;
	Function<Integer, Integer> valueOfInt = Integer::valueOf;
	Function<String, Integer> valueOfString = Integer::valueOf;
	BiFunction<String, Integer, Integer> valueOfStringAndRadix = Integer::valueOf;

}
