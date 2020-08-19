package com.core.lambdas.functions;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class Greeters_with_BiConsumer {

	public static void main(String[] args) {
		greetFolks();
	}

	public static void greetFolks() {
		BiConsumer<String, String> printConcat = (left, right) -> System.out.println(left + right);
		for (String name : Arrays.asList("Alice", "Bob", "Cathy")) {
			printConcat.accept("Goodbye, ", name);
		}
	}
}
