package com.core.lambdas.variable;

import com.core.lambdas.lexical.Printer;

public class VariableCapture {

	private int counter = 0;

	public Printer createLambda(int incrementBy) {
		Printer printer = msg -> {
			counter += incrementBy;
			System.out.println(msg + ": counter = " + counter);
		};
		return printer;
	}
}
