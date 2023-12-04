package com.example.designpatternslab;

class Paragraph implements BookComponent{
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    @Override
    public void print() {
        System.out.println("Paragraph: " + text);
    }
}
