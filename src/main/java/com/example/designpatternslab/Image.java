package com.example.designpatternslab;

import java.util.concurrent.TimeUnit;

class Image implements BookComponent {
    private String imageUrl;

    public Image(String imageUrl) {
        this.imageUrl = imageUrl;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void print() {
        System.out.println("Image with name: " + imageUrl);
    }
}