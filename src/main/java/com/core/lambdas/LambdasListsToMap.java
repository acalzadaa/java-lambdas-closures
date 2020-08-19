package com.core.lambdas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class LambdasListsToMap<R> {

	public <T> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

		Map<T, R> result = new HashMap<>();

		for (T t : list) {
			result.put(t, func.apply(t));
		}

		return result;

	}

	public Integer getLength(String str) {
		return str.length();
	}

}
