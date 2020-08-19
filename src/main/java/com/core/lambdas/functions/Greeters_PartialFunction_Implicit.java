package com.core.lambdas.functions;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Greeters_PartialFunction_Implicit {

	public static void main(String[] args) {
		/*
		 * BiFunction<T,U,R> T=type of 1st parameter, U=type of 2nd parameter, R=type or
		 * response
		 */

		/* receives two values and return both values concatenated */
		BiFunction<String, String, String> concat = (a, b) -> a + b;

		/*
		 * sends the function concat, first element is "Hello," second element is.. the
		 * one that is applied later
		 */
		greetFolks(whom -> concat.apply("Hello, ", whom));
	}

	/*
	 * Function<T, R> <T> the type of the input to the function <R> the type of the
	 * result of the function
	 */
	public static void greetFolks(Function<String, String> greeter) {

		for (String name : Arrays.asList("Alice", "Alex", "Sam", "Conny")) {
			System.out.println(greeter.apply(name));
		}

	}

}
