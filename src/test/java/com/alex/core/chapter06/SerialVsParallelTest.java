package com.alex.core.chapter06;

import org.junit.jupiter.api.Test;

class SerialVsParallelTest {

	@Test
	void test() {
		SerialVsParallel serials = new SerialVsParallel();
		serials.flatMapExamination();
	}

}
