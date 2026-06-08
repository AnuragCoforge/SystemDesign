package com.documentapp;


public class ImageElement extends DocumentElement{
	private String imagePath;
	
	public ImageElement(String imagePath) {
		this.imagePath = imagePath;
	}
	
	String render() {
		return "[Image: " + imagePath + "]";
	}
}
