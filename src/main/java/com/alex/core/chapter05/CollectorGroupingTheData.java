package com.alex.core.chapter05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.alex.core.Album;
import com.alex.core.Artist;

public class CollectorGroupingTheData {
	public Map<Artist, List<Album>> albumsByArtist(Stream<Album> albums) {
		return albums.collect(Collectors.groupingBy(album -> album.getMainMusician()));
	}

}
