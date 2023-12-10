package com.example.designpatternslab;

class AlignCenter implements AlignStrategy {
    @Override
    public String align(String text) {
        return "Center-aligned: " + text;
    }
}