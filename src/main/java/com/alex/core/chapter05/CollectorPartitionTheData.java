package com.alex.core.chapter05;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.alex.core.Artist;

public class CollectorPartitionTheData {

	public Map<Boolean, List<Artist>> bandsAndSolo(Stream<Artist> artists) {
		return artists.collect(Collectors.partitioningBy(Artist::isSolo));
	}
}
