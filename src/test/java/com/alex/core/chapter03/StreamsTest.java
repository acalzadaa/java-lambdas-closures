package com.alex.core.chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.alex.core.Album;
import com.alex.core.Track;

class StreamsTest {

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
		tracks.add(new Track("Bakai", 524));
		tracks.add(new Track("Violets for Your Furs", 378));
		tracks.add(new Track("Time Was", 451));

		Streams streams = new Streams();
		Assertions.assertEquals(378, streams.maxs(tracks).getLength());
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

	@Test
	void testFindLongTracks() {
		List<Track> tracks = new ArrayList<>();
		tracks.add(new Track("Bakai", 70));
		tracks.add(new Track("Violets for Your Furs", 60));
		tracks.add(new Track("Time Was", 50));

		List<Album> albums = new ArrayList<>();
		albums.add(new Album(tracks));

		Streams streams = new Streams();
		Set<String> trackNames = new HashSet<>();
		trackNames.add("Bakai");
		Assertions.assertEquals(trackNames, streams.findLongTracks(albums));

	}

}
