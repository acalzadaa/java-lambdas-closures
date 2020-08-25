package com.core.streams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.core.Track;

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

	@Test
	void testMapsAndCollect() {
		String[] stringArray = { "alex", "conny", "sam" };
		List<String> names = new ArrayList<>();
		Collections.addAll(names, stringArray);

		Streams streams = new Streams();
		Assertions.assertEquals(3, streams.maps(names).size());
		Assertions.assertEquals("ALEX", streams.maps(names).get(0));

	}

	@Test
	void testFiltersAndCollect() {
		String[] stringArray = { "alex", "conny", "sam" };
		List<String> names = new ArrayList<>();
		Collections.addAll(names, stringArray);

		Streams streams = new Streams();
		Assertions.assertEquals(1, streams.filters(names).size());
		Assertions.assertEquals("alex", streams.filters(names).get(0));
	}

	@Test
	void testMaxAndComparators() {
		List<Track> tracks = new ArrayList<>();
		tracks.add(new Track("Bakai", 40));
		tracks.add(new Track("Violets for Your Furs", 240));
		tracks.add(new Track("Time Was", 50));

		Streams streams = new Streams();
		Assertions.assertEquals(240, streams.maxs(tracks).getLength());
		Assertions.assertEquals("Violets for Your Furs", streams.maxs(tracks).getName());
	}

	@Test
	void testReduces() {
		Integer[] integerArray = { 2, 4, 6 };
		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, integerArray);

		Streams streams = new Streams();
		Assertions.assertEquals(12, streams.reduces(numbers));

	}

}
