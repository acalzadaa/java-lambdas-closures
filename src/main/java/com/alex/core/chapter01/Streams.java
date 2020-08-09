package com.alex.core.chapter01;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Streams {

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
