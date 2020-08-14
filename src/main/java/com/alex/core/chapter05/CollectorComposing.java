package com.alex.core.chapter05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alex.core.Album;
import com.alex.core.Artist;

public class CollectorComposing {

	public Map<Artist, Long> numberOfAlbums(List<Album> albums) {
		return albums.stream().collect(Collectors.groupingBy(Album::getMainMusician, Collectors.counting()));
	}

	public Map<Artist, List<String>> listOfAlbums(List<Album> albums) {
		return albums.stream().collect(
				Collectors.groupingBy(Album::getMainMusician, Collectors.mapping(Album::getName, Collectors.toList())));
	}

}
