package com.documentapp;

public class DocumentEditor {
	private Document document;
	private Persistence storage;
	String renderedDocument;
	
	public DocumentEditor(Document document, Persistence storage) {
		this.document = document;
		this.storage = storage;
	}
	void addText(String text) {
		document.addElement(new TextElement(text));
	}
	void addImage(String imagePath) {
		document.addElement(new ImageElement(imagePath));
	}
	void addNewLine() {
		document.addElement(new NewLineElement());
	}
	void TabSpaceElement() {
		document.addElement(new TabSpaceElement());
	}
	

public String renderDocument() {
    String renderedDocument = document.render();  // ✅ generate fresh output

    if (renderedDocument == null || renderedDocument.isEmpty()) {
        return "Document is empty";
    }

    return renderedDocument;
}

	
	void saveDocument() {
		storage.save(renderedDocument);
	}
}
