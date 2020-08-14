package com.alex.core.chapter05;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.alex.core.Album;
import com.alex.core.Artist;

public class CollectorToValues {

	public Optional<Artist> biggestGroup(Stream<Artist> artists) {
		Function<Artist, Integer> getCount = artist -> artist.getMembers().size();
		return artists.collect(Collectors.maxBy(Comparator.comparing(getCount)));
	}

	public double averageNumberOfTracks(List<Album> albums) {
		return albums.stream().collect(Collectors.averagingInt(album -> album.getTracks().size()));
	}
}
