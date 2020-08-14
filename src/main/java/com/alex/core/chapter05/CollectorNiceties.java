package com.alex.core.chapter05;

import java.util.Map;

import com.alex.core.Artist;

public class CollectorNiceties {

	public Map<String, Artist> artistCache;

	public String readArtistFromDB(String name) {
		return "Sting";
	}

//	public Artist getArtist(String name) {
//		return artistCache.computeIfAbsent(name, this::readArtistFromDB);
//	}

}
