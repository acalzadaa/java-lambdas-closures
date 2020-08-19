package com.core.lambdas.functions;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TypesOfLambdas {

	public String withOutArguments(String a) {
		final StringBuilder sb = new StringBuilder();
		UnaryOperator<String> sb_total = (x) -> {
			return x.length() > 0 ? sb.append("Mi nombre es: ").append(x).toString()
					: sb.append("Mi nombre es: anonimo").toString();
		};
		return sb_total.apply(a);

	}

	public String multiStatement(String a, String b) {
		final StringBuilder sb = new StringBuilder();
		BinaryOperator<String> sb_total = (x, y) -> {
			sb.append(x);
			sb.append(" ");
			sb.append(y);
			return sb.toString();
		};
		return sb_total.apply(a, b);
	}

	public Long adding(Long a, Long b) {
		BinaryOperator<Long> add = (x, y) -> x + y;
		return add.apply(a, b);
	}

	public Long addingExplicit(Long a, Long b) {
		BinaryOperator<Long> add = (Long x, Long y) -> x + y;
		return add.apply(a, b);
	}

	/* Predicates! */

	public boolean isAtLeast5(int value) {
		Predicate<Integer> atLeast5 = x -> x >= 5;
		return atLeast5.test(value);
	}
}
