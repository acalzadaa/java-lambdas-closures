package com.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Person {

	public static enum Genre {
		MALE, FEMALE;
	}

	private long id;
	private String name;
	private double salary;
	private Genre genre;

	public boolean isFemale() {
		return this.genre.name().contains(Genre.FEMALE.toString()) ? true : false;
	}

}
