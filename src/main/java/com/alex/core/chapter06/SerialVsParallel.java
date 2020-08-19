package com.alex.core.chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.core.Album;
import com.core.Artist;
import com.core.Track;

public class SerialVsParallel {

	public Long serialArraySum(List<Album> albums) {
		int[] intArray = { 1, 2, 3, 4, 5, 6 };
		Stream<int[]> streamArray = Stream.of(intArray);
		IntStream intStream = streamArray.flatMapToInt(x -> Arrays.stream(x));

		return null;
	}

	public void flatMapExamination() {
		Album obj1 = new Album();
		obj1.setName("uno");
		obj1.getTracks().add(new Track("track1", 666));
		obj1.setMainMusician(new Artist("an artist", "london"));
		obj1.getMusicians().add(new Artist("an other artist", "not london"));

		List<Album> albums = new ArrayList<>();
		albums.add(obj1);

		albums.stream().map(album -> album.getTracks()).peek(album -> System.out.println("album: " + album));
	}

}
