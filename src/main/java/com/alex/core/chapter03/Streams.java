package com.alex.core.chapter03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.alex.core.Track;

public class Streams {

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

}
