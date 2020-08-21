package com.core.lambdas.typing;

/* functional interfaces can have only ONE abstract method */

@FunctionalInterface
public interface Adder {
	double add(double n1, double n2);
}
