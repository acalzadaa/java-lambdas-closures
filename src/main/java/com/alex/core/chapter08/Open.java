package com.alex.core.chapter08;

public class Open implements Action {

	private final Editor editor;

	public Open(Editor editor) {
		this.editor = editor;
	}

	@Override
	public void perform() {
		editor.open();
	}

}
