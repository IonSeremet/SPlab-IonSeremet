package com.example.designpatternslab;

class ImageProxy implements BookComponent {
    private Image realImage;
    private String imageName;

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        if (realImage == null) {
            realImage = new Image(imageName);
        }
        realImage.print();
    }
}