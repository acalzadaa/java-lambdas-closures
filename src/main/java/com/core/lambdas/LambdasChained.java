package com.core.lambdas;

import java.util.function.Function;

public class LambdasChained {
	Function<Integer, Integer> addOne = x -> x + 1;
	Function<Integer, Integer> addFive = x -> x + 5;
	Function<Integer, Integer> square = x -> x * x;

}
