package com.alex.core.chapter03;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {

	public static enum Genre {
		HORROR, COMEDY, TECHNICAL;
	}

	private final String title;
	private final String author;
	private final Genre genre;
}
