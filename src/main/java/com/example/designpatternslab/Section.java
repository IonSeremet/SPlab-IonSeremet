package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

class Section implements BookComponent, Alignable {
    private String title;
    private List<Alignable> content;
    private AlignStrategy alignStrategy;


    public Section(String title) {
        this.title = title;
        content = new ArrayList<>();
    }

    public void add(Alignable alignable) {
        content.add(alignable);
    }
    @Override
    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    @Override
    public void print() {
        System.out.println(title);
        for (Alignable alignable : content) {
            alignable.setAlignStrategy(alignStrategy);
            alignable.print();
        }
    }
}
