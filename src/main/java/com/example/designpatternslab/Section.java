package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

class Section implements BookComponent {
    private String title;
    private List<BookComponent> content;

    public Section(String title) {
        this.title = title;
        content = new ArrayList<>();
    }

    public void add(BookComponent component) {
        content.add(component);
    }

    @Override
    public void print() {
        System.out.println(title);

        for (BookComponent component : content) {
            component.print();
        }
    }
}
