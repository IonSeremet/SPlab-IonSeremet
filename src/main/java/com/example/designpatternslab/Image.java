package com.example.designpatternslab;

class Image implements BookComponent {
    private String imageUrl;

    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + imageUrl);
    }
}