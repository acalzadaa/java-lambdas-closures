package com.core.functional.interfaces.generic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperTest {

	/*
	 * Mapper will receive a List of something and do a mapper lambda to each
	 * element of the list that will always return an INT!!
	 */

	@Test
	void testMapperWithStrings() {
		String[] names = { "Huggie", "Louis", "Franky" };
		int[] lengthMapping = Mapper.mapToInt(names, (String name) -> name.length());
		Assertions.assertEquals(6, lengthMapping[0]);
		Assertions.assertEquals(5, lengthMapping[1]);
		Assertions.assertEquals(6, lengthMapping[2]);
	}

	@Test
	void testMapperWithIntegers() {
		Integer[] numbers = { 1, 2, 3 };
		int[] countMapping = Mapper.mapToInt(numbers, (Integer number) -> number * number);
		Assertions.assertEquals(1, countMapping[0]);
		Assertions.assertEquals(4, countMapping[1]);
		Assertions.assertEquals(9, countMapping[2]);

	}

}
