package com.example.springdatatest.teaching.patterns.fabric;

public class SubCreatorA extends Creator{
    @Override
    public Product createProduct(Product product) {
        return new ProductA();
    }
}
