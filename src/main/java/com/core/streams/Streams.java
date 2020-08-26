package com.core.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.core.Track;

public class Streams {

	public int squareOddIntegers(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 == 1).map(number -> number * number).reduce(0,
				Integer::sum);
	}

	public int squareAllIntegers(List<Integer> numbers) {
		return numbers.stream().map(number -> number * number).reduce(0, Integer::sum);

		/*
		 * return numbers.stream().map(n -> n * n).reduce(0, (a,b) -> a+n); Note:
		 * reduce( Initial Value, ConstructorReference );
		 */
	}

	public List<String> maps(List<String> names) {
		return names.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
	}

	public List<String> filters(List<String> names) {
		return names.stream().filter(n -> n.toLowerCase().startsWith("a")).collect(Collectors.toList());
	}

	public Track maxs(List<Track> tracks) {
		return tracks.stream().max(Comparator.comparing(track -> track.getLength())).get();
	}

	public Integer reduces(List<Integer> numbers) {
		return numbers.stream().reduce(0, (accumulator, element) -> accumulator + element);
	}

	public List<String> filteredListsToUpper(List<String> items) {
		return items.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
	}

	public List<String> filteredListsPrefix(List<String> items, String prefix) {
		return items.stream().filter(e -> (!e.startsWith(prefix))).collect(Collectors.toList());
	}

	public List<String> filteredListsPostfix(List<String> items, String postfix) {
		return items.stream().filter(e -> (!e.endsWith(postfix))).collect(Collectors.toList());
	}

	public List<String> filteredListsPrefixAndPostfix(List<String> items, String prefix, String postfix) {
		return items.stream().filter(e -> (!e.endsWith(postfix))).filter(e -> (!e.startsWith(prefix)))
				.collect(Collectors.toList());
	}

	public List<String> filteredListsDistinct(List<String> items) {
		return items.stream().distinct().collect(Collectors.toList());
	}

	public List<String> filteredListsLimit(List<String> items, int limit) {
		return items.stream().limit(limit).collect(Collectors.toList());
	}

	public List<String> filteredListsSkip(List<String> items, int skip) {
		return items.stream().skip(skip).collect(Collectors.toList());
	}

	public List<String> filteredListsSort(List<String> items) {
		return items.stream().sorted().collect(Collectors.toList());
	}

}
