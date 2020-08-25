package com.core.lambdas.method;

public interface Priced {
	default double getPrice() {
		return 1.0;
	}
}