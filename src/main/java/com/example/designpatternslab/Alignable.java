package com.example.designpatternslab;


interface Alignable {
    void setAlignStrategy(AlignStrategy strategy);

    void print();
}