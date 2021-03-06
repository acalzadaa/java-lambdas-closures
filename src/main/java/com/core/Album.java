package com.core;

import java.util.List;

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
public class Album {
	private String name;
	private List<Track> tracks;
	private List<Artist> musicians;
	private Artist mainMusician;

}
