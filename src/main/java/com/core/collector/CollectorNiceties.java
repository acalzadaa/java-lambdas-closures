package com.core.collector;

import java.util.Map;

import com.core.Artist;

public class CollectorNiceties {

	public Map<String, Artist> artistCache;

	public Artist readArtistFromDB(String name) {
		return new Artist(name, "London");
	}

	public Artist getArtist(String name) {
		return artistCache.computeIfAbsent(name, this::readArtistFromDB);
	}

}
