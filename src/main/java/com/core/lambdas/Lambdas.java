package com.core.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

	Function<String, Integer> func = x -> x.length();

	Function<Integer, Integer> func2 = x -> x + 1;

	BiFunction<Integer, Integer, Integer> func3 = (x, y) -> x > y ? x : y;

}
