package com.core.functional.interfaces.consumer;

import java.util.function.Consumer;

public class Consumers {

	Consumer<String> upperCaseConsumer = String::toUpperCase;
	Consumer<String> trimConsumer = String::trim;
	Consumer<String> printConsumer = System.out::println;

	void printingHelloWorld() {
		upperCaseConsumer.andThen(trimConsumer).andThen(printConsumer).accept(" HelloWorld ");
	}

}
