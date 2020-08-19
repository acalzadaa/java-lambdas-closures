package com.core;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class Artist {
	@NonNull
	private String name;

	private List<Artist> members;
	@NonNull
	private String origin;
	private boolean isSolo;
}
