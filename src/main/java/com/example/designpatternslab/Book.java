package com.example.designpatternslab;
import java.util.ArrayList;
import java.util.List;

class Book implements BookComponent, Visitee {
    private String title;
    private List<Author> authors;
    private List<BookComponent> content;

    public Book(String title) {
        this.title = title;
        authors = new ArrayList<>();
        content = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

//    public int createChapter(String chapterTitle) {
//        Chapter chapter = new Chapter();
//        chapters.add(chapter);
//        return chapters.indexOf(chapter);
//    }
//
//    public Chapter getChapter(int index) {
//        return chapters.get(index);
//    }
public void addContent(BookComponent component) {
    content.add(component);
}
    @Override
    public void print() {
        System.out.println("Book: " + title);

        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println("Author: " + author.getName());
        }

        for (BookComponent component : content) {
            component.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBook(this);

    }

    public String getTitle() {
        return title;
    }
}

