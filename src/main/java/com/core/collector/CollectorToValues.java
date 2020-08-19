package com.core.collector;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.core.Album;
import com.core.Artist;

public class CollectorToValues {

	public Optional<Artist> biggestGroup(Stream<Artist> artists) {
		Function<Artist, Integer> getCount = artist -> artist.getMembers().size();
		return artists.collect(Collectors.maxBy(Comparator.comparing(getCount)));
	}

	public double averageNumberOfTracks(List<Album> albums) {
		return albums.stream().collect(Collectors.averagingInt(album -> album.getTracks().size()));
	}
}
