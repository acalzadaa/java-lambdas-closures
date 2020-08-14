package com.alex.core.chapter05;

import java.util.List;
import java.util.stream.Collectors;

import com.alex.core.Artist;

public class CollectorStrings {

	public String formattingArtistNames(List<Artist> artists) {
		return artists.stream().map(Artist::getName).collect(Collectors.joining(", ", "[", "]"));
	}

}
