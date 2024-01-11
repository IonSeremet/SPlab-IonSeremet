package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

class Chapter implements Visitee {
    private List<SubChapter> subChapters;

    public Chapter() {
        subChapters = new ArrayList<>();
    }

    public int createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        subChapters.add(subChapter);
        return subChapters.indexOf(subChapter);
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitChapter(this);

    }

    public List<SubChapter> getSubChapters() {
        return subChapters;
    }
}
