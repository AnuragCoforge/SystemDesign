package com.documentapp;

import java.util.*;

public class Document {
    private ArrayList<DocumentElement> documentElements;

    // ✅ FIX 1: initialize list
    public Document() {
        documentElements = new ArrayList<>();
    }

    public void addElement(DocumentElement element) {
        documentElements.add(element);
    }

    /// render the document by concatenating the render output of all elements.
    String render() {
        // ✅ FIX 2: initialize with empty string
        String result = "";

        for (DocumentElement element : documentElements) {
            result += element.render();
        }

        return result;
}
}