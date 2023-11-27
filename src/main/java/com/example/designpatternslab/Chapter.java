package com.example.designpatternslab;

import java.util.ArrayList;
import java.util.List;

class Chapter {
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
}
