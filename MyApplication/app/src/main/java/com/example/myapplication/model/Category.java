package com.example.myapplication.model;

public class Category {
    private int img;
    private String name;

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category(int img, String name) {
        this.img = img;
        this.name = name;
    }
}
