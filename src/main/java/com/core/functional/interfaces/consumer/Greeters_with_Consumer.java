package com.core.functional.interfaces.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

public class Greeters_with_Consumer {

	public static void main(String[] args) {
		greetFolks();
	}

	public static void greetFolks() {
		Consumer<String> doGreet = name -> System.out.println("Hello, " + name);
		for (String name : Arrays.asList("Alice", "Bob", "Cathy")) {
			doGreet.accept(name);
		}
	}
}
