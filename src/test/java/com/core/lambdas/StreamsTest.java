package com.core.lambdas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.core.lambdas.Streams;

class StreamsTest {

	Streams streams = new Streams();

	@Test
	void filteredListsTest() {
		List<String> items = new ArrayList<>();
		items.add("acida");
		items.add("anima");
		items.add("berilio");
		items.add("cesio");

		assertEquals(2, streams.filteredListsPrefix(items, "a").size());
		assertEquals(2, streams.filteredListsPostfix(items, "o").size());

	}

}
