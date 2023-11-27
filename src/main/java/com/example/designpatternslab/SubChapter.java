package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

class SubChapter {
    private String title;
    private List<Object> content;

    public SubChapter(String title) {
        this.title = title;
        content = new ArrayList<>();
    }

    public void createNewParagraph(String text) {
        content.add(new Paragraph(text));
    }

    public void createNewImage(String imageName) {
        content.add(new Image(imageName));
    }

    public void createNewTable(String tableTitle) {
        content.add(new Table(tableTitle));
    }

    public void print() {
        System.out.println("Subchapter: " + title);

        for (Object item : content) {
            if (item instanceof Paragraph) {
                System.out.println("Paragraph: " + ((Paragraph) item).getText());
            }
        }

        for (Object item : content) {
            if (item instanceof Image) {
                System.out.println("Image with name: " + ((Image) item).getImageUrl());
            }
        }

        for (Object item : content) {
            if (item instanceof Table) {
                System.out.println("Table with Title: " + ((Table) item).getText());
            }
        }
    }
}