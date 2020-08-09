package com.alex.core.chapter02;

/*Anonymous Inner Classes as a Closure*/

public class Greeters {

	public interface Greeter {
		String createGreeting(String whom);
	}

	public static void main(String[] args) {
		// Create variable in this scope
		final String greeting = "Hello, ";

		Greeter greeter = new Greeter() {
			@Override
			public String createGreeting(String whom) {
				// Close (ie: capture) the variable here
				return greeting + whom + "!";
			}
		};
		greetWorld(greeter);
	}

	public static void greetWorld(Greeter greeter) {
		// Have the greeter use the closed variable here
		// Note that the "greeting" variable is out of scope
		System.out.println(greeter.createGreeting("World"));
	}

}