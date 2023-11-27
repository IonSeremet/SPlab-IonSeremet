package com.example.designpatternslab;
import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        authors = new ArrayList<>();
        chapters = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public int createChapter(String chapterTitle) {
        Chapter chapter = new Chapter();
        chapters.add(chapter);
        return chapters.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }
}