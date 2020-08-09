package com.alex.core.chapter01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LambdasListsToMapTest {

	@Test
	void test() {
		LambdasListsToMap obj = new LambdasListsToMap();

		List<String> list = new ArrayList<>();
		String listArray[] = { "a", "b", "a", "b", "c", "a" };
		Collections.addAll(list, listArray);

		Map<String, Integer> map = obj.convertListToMap(list, x -> ((String) x).length());
		Assertions.assertEquals(map.size(), 3);
		map.forEach((a, b) -> System.out.println(a + " " + b));

		Map<String, Integer> map2 = obj.convertListToMap(list, x -> obj.getLength((String) x));
		Assertions.assertEquals(map2.size(), 3);
		map2.forEach((a, b) -> System.out.println(a + " " + b));

		Map<String, Long> map3 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map3.forEach((a, b) -> System.out.println(a + " " + b));

		/* list to map */

		Map<String, Long> map4 = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map4 = map4.entrySet().stream().filter(x -> x.getValue() % 2 == 0)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

		map4.forEach((a, b) -> System.out.println(a + " " + b));

	}

}
