package com.core.collector;

import java.util.List;
import java.util.stream.Collectors;

import com.core.Artist;

public class CollectorStrings {

	public String formattingArtistNames(List<Artist> artists) {
		return artists.stream().map(Artist::getName).collect(Collectors.joining(", ", "[", "]"));
	}

}
