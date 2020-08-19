package com.core.lambdas.functions;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Greeters_Currying_Explicit {
	public static void main(String[] args) {
		/* bifunction tiene 2 variables y 1 response */
		BiFunction<String, String, String> concat = (a, b) -> a + b;

		/*
		 * curriedConcat tiene 1 variable (greetings) y (2 variables y 1 response)
		 * (greetings + name) => concat(a,b)
		 */
		Function<String, Function<String, String>> curriedConcat = curry(concat); //

		/*
		 * la lista de greetings se va a aplicar a Function<T ~ la cual se va a aplicar
		 * a: Function<U,V> donde U va a ser igual a "name" y V va a ser applicada por T
		 */
		for (String greetings : Arrays.asList("Hello", "Guten Tag", "Bonjour")) {
			greetFolks(curriedConcat.apply(greetings + ", "));
		}
	}

	/*
	 * la lista de nombres se aplicara a Function<U,V> en U (greetings + "name") y
	 * regresara V
	 */
	public static void greetFolks(Function<String, String> apply) {
		for (String name : Arrays.asList("Alice", "Bob", "Cathy")) {
			System.out.println(apply.apply(name));
		}
	}

	/* agregara Greetings "t" y Function<T, ...> y regresara Function<U, V> */
	public static <T, U, V> Function<T, Function<U, V>> curry(BiFunction<T, U, V> concat) {
		return t -> (u -> concat.apply(t, u));
	}
}
