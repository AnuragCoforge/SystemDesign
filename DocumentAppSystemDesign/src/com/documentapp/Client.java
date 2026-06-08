package com.documentapp;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document document = new Document();
		Persistence persistence = new FileStorage();
		
		DocumentEditor editor = new DocumentEditor(document, persistence);
		
		/// simulating the client
		editor.addText("Hello World");
		editor.addNewLine();
		editor.addText("This is a real-world document editor example");
		editor.addNewLine();
		editor.addImage("picture.png");
		
		System.out.println(editor.renderDocument());
		editor.saveDocument();
		

	}

}