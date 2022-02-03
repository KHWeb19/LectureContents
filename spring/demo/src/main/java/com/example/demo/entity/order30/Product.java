package com.example.demo.entity.order30;

import lombok.Data;

@Data
public class Product {

    private String name;
    private int price;
    private final int MAX = ProductList.priceList.length;

    public Product () {
        int randIdx = getRandom();

        name = ProductList.productName[randIdx];
        price = ProductList.priceList[randIdx];
    }

    public int getRandom () {
        return (int) (Math.random() * MAX);
    }
}
