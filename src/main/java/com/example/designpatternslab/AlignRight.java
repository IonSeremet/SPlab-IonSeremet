package com.example.designpatternslab;

class AlignRight implements AlignStrategy {
    @Override
    public String align(String text) {
        return "Right-aligned: " + text;
    }
}