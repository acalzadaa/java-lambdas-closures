package com.core.lambdas.typing;

public class LambdaUtil {

	public double testAdder(Adder adder) {
		double x = 111.11;
		double y = 222.22;

		return adder.add(x, y);
	}

	public String testJoiner(Joiner joiner) {
		String x = "Hola";
		String y = "Mundo";

		return joiner.join(x, y);
	}

}
