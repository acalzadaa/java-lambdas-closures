package com.alex.core.chapter02;

import java.util.function.Function;

public class Greeters_Lambdas {

	public static void main(String[] args) {
		String greeting = "Hello, ";
		Function<String, String> greeter = whom -> greeting + whom + "!";
		greeterWorld(greeter);
	}

	public static void greeterWorld(Function<String, String> greeter) {
		System.out.println(greeter.apply("Whom"));
	}

}
