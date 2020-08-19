package com.core.collector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.Album;
import com.core.Artist;

public class CollectorComposing {

	public Map<Artist, Long> numberOfAlbums(List<Album> albums) {
		return albums.stream().collect(Collectors.groupingBy(Album::getMainMusician, Collectors.counting()));
	}

	public Map<Artist, List<String>> listOfAlbums(List<Album> albums) {
		return albums.stream().collect(
				Collectors.groupingBy(Album::getMainMusician, Collectors.mapping(Album::getName, Collectors.toList())));
	}

}
