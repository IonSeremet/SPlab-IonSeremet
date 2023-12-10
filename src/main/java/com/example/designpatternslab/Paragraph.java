package com.example.designpatternslab;

class Paragraph implements BookComponent, Alignable{
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    @Override
    public void setAlignStrategy(AlignStrategy strategy) {
        this.alignStrategy = strategy;
    }

    @Override
    public void print() {
        if (alignStrategy == null) {
            System.out.println(text);
        } else {
            System.out.println(alignStrategy.align(text));
        }
    }
}
