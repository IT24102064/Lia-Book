package com.lia.books;

public class Book {
    private String title;
    private String category;
    private String img;
    private String rating;
    private double price;
    private String type;
    private boolean inStock;

    // Constructors
    public Book() {}

    public Book(String title, String category, String img, String rating, double price, String type, boolean inStock) {
        this.title = title;
        this.category = category;
        this.img = img;
        this.rating = rating;
        this.price = price;
        this.type = type;
        this.inStock = inStock;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}

