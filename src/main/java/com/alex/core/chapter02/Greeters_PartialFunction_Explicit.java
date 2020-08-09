package com.alex.core.chapter02;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Greeters_PartialFunction_Explicit {

	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		greetFolks(applyPartial(concat, "Hello,"));
	}

	public static void greetFolks(Function<String, String> applyPartial) {
		for (String name : Arrays.asList("Conny", "Sam", "Alex")) {
			System.out.println(applyPartial.apply(name));
		}

	}

	public static <T, U, R> Function<U, R> applyPartial(BiFunction<T, U, R> concat, T firstArgument) {
		// TODO Auto-generated method stub
		return u -> concat.apply(firstArgument, u);
	}

}
