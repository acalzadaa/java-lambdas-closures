package com.core.streams.creating;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.core.Person;
import com.core.Person.Genre;

public class ApplyingOperations {

	public long debuggingAStreamPipeline() {
		return Stream.of(1, 2, 3, 4, 5).peek(e -> System.out.println("Reading number: " + e)).filter(n -> n % 2 == 0)
				.peek(e -> System.out.println("Welcoming number: " + e)).map(n -> n * n)
				.peek(e -> System.out.println("Squaring number: " + e)).reduce(0, Integer::sum);
	}

	public List<Person> applyingForEachOperation() {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(1, "Elliot", 6000, Genre.MALE));
		persons.add(new Person(2, "Connie", 6000, Genre.FEMALE));
		persons.add(new Person(3, "Samantha", 5000, Genre.FEMALE));
		persons.add(new Person(4, "Ray", 7000, Genre.MALE));

		persons.stream().filter(Person::isFemale).peek(p -> System.out.println("Found a Female: " + p))
				.forEach(p -> p.setSalary(p.getSalary() * 1.25));
		return persons;
	}

	public List<Integer> applyingMapOperation() {
		return Stream.of(1, 2, 3).map(n -> n * n).collect(Collectors.toList());
	}

}
