package com.example.designpatternslab;

class AlignLeft implements AlignStrategy {
    @Override
    public String align(String text) {
        return "Left-aligned: " + text;
    }
}