package com.core.lambdas.variable;

import org.junit.jupiter.api.Test;

import com.core.lambdas.lexical.Printer;

class VariableCaptureTest {

	@Test
	void test() {
		VariableCapture vc1 = new VariableCapture();
		VariableCapture vc2 = new VariableCapture();

		Printer p1 = vc1.createLambda(1);
		Printer p2 = vc2.createLambda(100);

		p1.print("h1");
		p2.print("h2");
		p1.print("h3");
		p2.print("h4");

	}

}
