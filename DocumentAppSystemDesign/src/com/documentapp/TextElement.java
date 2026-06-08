package com.documentapp;

public class TextElement extends DocumentElement{
	private String text;
	
	public TextElement(String text) {
		this.text = text;
	}
	
	String render() {
		return text;
	}
}
