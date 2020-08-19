package com.alex.core.chapter08;

import java.util.ArrayList;
import java.util.List;

public class Macro {
	private List<Action> actions = null;

	public Macro() {
		actions = new ArrayList<>();
	}

	public void record(Action action) {
		actions.add(action);
	}

	public void run() {
		actions.forEach(Action::perform);
	}

	public void stop() {
		actions.clear();
	}

}
