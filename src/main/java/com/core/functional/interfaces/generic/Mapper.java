package com.core.functional.interfaces.generic;

@FunctionalInterface
public interface Mapper<T> {
	// only one abstract method!
	int map(T source);

	// one generic static method
	public static <U> int[] mapToInt(U[] list, Mapper<? super U> mapper) {
		int[] mappedValues = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			// Map the object -> int
			mappedValues[i] = mapper.map(list[i]);
		}

		return mappedValues;

	}
}
