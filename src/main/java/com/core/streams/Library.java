package com.core.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Library {
	private final List<Book> books = new ArrayList<>();
	private final Map<Book, String> featuredBooks = new HashMap<>();

}
