package com.dto;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private String price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}