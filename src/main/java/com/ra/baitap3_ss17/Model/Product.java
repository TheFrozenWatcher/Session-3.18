package com.ra.baitap3_ss17.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Builder
@Getter
public class Product {
    // Getters and Setters
    private int id;
    private String name;
    private double price;
    private int stock;
    private Category category;
    private boolean status;

    // Constructor
    public Product(int id, String name, double price, int stock, Category category, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.category = category;
        this.status = status;
    }

}
