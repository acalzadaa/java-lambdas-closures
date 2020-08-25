package com.core.lambdas.lexical;

import org.junit.jupiter.api.Test;

class LexicalScopingTest {

	@Test
	void test() {
		LexicalScoping scope = new LexicalScoping();
		scope.getAnonymousPrinter();
		scope.getLambdaPrinter();
	}

}
