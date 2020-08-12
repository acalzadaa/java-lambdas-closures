package com.alex.core.chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.alex.core.chapter03.Book.Genre;

class LibraryTest {

	/* Functional Iteration */

	@Test
	void testing_books() {
		Assertions.assertEquals(new Book("Uno", "Alex", Genre.COMEDY).getTitle(), "Uno");
		Assertions.assertEquals(new Book("Uno", "Alex", Genre.COMEDY).getAuthor(), "Alex");
		Assertions.assertEquals(new Book("Uno", "Alex", Genre.COMEDY).getGenre(), Genre.COMEDY);
	}

	@Test
	void testing_library_books() {
		List<Book> books = new ArrayList<>();
		Library library = new Library();

		books.add(new Book("Uno", "Yo", Genre.COMEDY));
		books.add(new Book("Dos", "Tu", Genre.HORROR));
		books.add(new Book("Tres", "El", Genre.TECHNICAL));
		books.add(new Book("Cuatro", "Nosotros", Genre.COMEDY));
		books.add(new Book("Cinco", "Ustedes", Genre.HORROR));
		books.add(new Book("Seis", "Ellos", Genre.TECHNICAL));

		books.forEach(b -> {
			library.getBooks().add(b);
			library.getFeaturedBooks().put(b, "some witty text");
		});

		Assertions.assertEquals(library.getBooks().size(), 6);
	}

	@Test
	void testing_library_featured_books() {
		List<Book> books = new ArrayList<>();
		Library library = new Library();

		books.add(new Book("Uno", "Yo", Genre.COMEDY));
		books.add(new Book("Dos", "Tu", Genre.HORROR));
		books.add(new Book("Tres", "El", Genre.TECHNICAL));
		books.add(new Book("Cuatro", "Nosotros", Genre.COMEDY));
		books.add(new Book("Cinco", "Ustedes", Genre.HORROR));
		books.add(new Book("Seis", "Ellos", Genre.TECHNICAL));

		books.forEach(b -> {
			library.getBooks().add(b);
			library.getFeaturedBooks().put(b, "some witty text");
		});

		Assertions.assertEquals(6, library.getFeaturedBooks().size());

	}

	@Test
	void testing_hash_map_from_array() {
		/* creating an array */

		Integer[] numberArray = { 1, 1, 2, 2, 2, 3, 4, 4, 5 };

		List<Integer> numbers = new ArrayList<>();
		Collections.addAll(numbers, numberArray);

		/*
		 * Identity – an element that is the initial value of the reduction operation
		 * and the default result if the stream is empty
		 * 
		 * Accumulator – a function that takes two parameters: a partial result of the
		 * reduction operation and the next element of the stream
		 * 
		 * Combiner – a function used to combine the partial result of the reduction
		 * operation when the reduction is parallelized, or when there's a mismatch
		 * between the types of the accumulator arguments and the types of the
		 * accumulator implementation
		 * 
		 */

	}

}
