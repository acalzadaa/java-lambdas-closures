package com.core.lambdas.method;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UnboundReceiver {

	Function<String, Integer> strLengthFunction = String::length;

	/* lambda expression CONCAT */
	BiFunction<String, String, String> concatFunctionLambda = (x, y) -> x.concat(y);

	/* instance method reference on an unbound receiver */
	BiFunction<String, String, String> concatFunction = String::concat;

}
