package com.core.lambdas.method;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ConstructorReferences {

	Supplier<String> func1 = () -> new String();
	Function<String, String> func2 = str -> new String(str);

	Supplier<String> func1_2 = String::new;
	Function<String, String> func2_2 = String::new;

	Supplier<Item> func3 = () -> new Item();
	Supplier<Item> func3_2 = Item::new;

	Function<String, Item> func4 = name -> new Item(name);
	Function<String, Item> func4_2 = Item::new;

	BiFunction<String, Double, Item> func5 = (name, price) -> new Item(name, price);
	BiFunction<String, Double, Item> func5_2 = Item::new;

	/* lambdas expressions for creating an Array constructor */

	IntFunction<int[]> arrayCreator = size -> new int[size];
	IntFunction<int[]> arrayCreator2 = int[]::new;

	Function<Integer, int[]> arrayCreator3 = int[]::new;

	IntFunction<int[][]> TwoDimensionArrayCreator = int[][]::new;

}
