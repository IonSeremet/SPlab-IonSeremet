package com.example.designpatternslab;

public class Table implements Visitee {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public String getText() {
        return title;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);

    }

    public String getTitle() {
        return title;
    }
}
