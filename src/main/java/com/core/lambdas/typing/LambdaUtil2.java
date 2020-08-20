package com.core.lambdas.typing;

public class LambdaUtil2 {

	public double test(Adder adder) {
		double x = 111.11;
		double y = 222.22;
		double sum = adder.add(x, y);
		System.out.println("Working with Adder: " + x + " " + y + " " + sum);
		return sum;
	}

	public String test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = joiner.join(s1, s2);
		System.out.println("Working with Joiner: " + s1 + " " + s2 + " " + s3);
		return s3;
	}
}
