package com.core.functional.interfaces.functions;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Testing_Currying_Explicit {

	public static void main(String[] args) {

		BiFunction<String, String, String> concat = (a, b) -> a + b;
		Function<String, Function<String, String>> curryConcat = curry(concat);

		for (String greeting : Arrays.asList("Hello", "Bon Jour", "Buon Giorno")) {
			greetFolks(curryConcat.apply(greeting + ", "));
		}
	}

	/*
	 * Recibe Function<String, String> donde T= greeting, U = name y V es
	 * concat(T,U)
	 */
	private static void greetFolks(Function<String, String> folks) {
		for (String name : Arrays.asList("Alex", "Conny", "Sam")) {
			System.out.println(folks.apply(name));
		}
	}

	/*
	 * T = t = es "greeting" se agrega (apply) a la funcion de concat y queda <U, V>
	 * y se envia en el return
	 */
	private static <T, U, V> Function<T, Function<U, V>> curry(BiFunction<T, U, V> concat) {
		return t -> (u -> concat.apply(t, u));
	}

}
