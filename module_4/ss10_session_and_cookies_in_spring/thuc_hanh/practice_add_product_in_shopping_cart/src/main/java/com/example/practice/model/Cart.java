package com.example.practice.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> products = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> products) {
        this.products = products;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public boolean checkItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            if (entry.getKey().getId().equals(product.getId())) {
                return true;
            }
        }
        return false;
    }

    private Map.Entry<Product, Integer> selectItemInCart(Product product) {
        for (Map.Entry<Product, Integer> entryItem : products.entrySet()) {
            if (entryItem.getKey().getId().equals(product.getId())) {
                return entryItem;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItemInCart(product)) {
            products.put(product, 1);
        } else {
            Map.Entry<Product, Integer> entryItem = selectItemInCart(product);
            Integer newQuantity = entryItem.getValue() + 1;
            products.replace(product, newQuantity);
        }
    }

    public Integer countItemQuantity() {
        return products.size();
    }

    public Integer countProductQuantity() {
        Integer totalProduct = 0;
        for (Map.Entry<Product, Integer> entryItems : products.entrySet()) {
            totalProduct += entryItems.getValue();
        }
        return totalProduct;
    }
    public float countTotalPayment()
    {
        float totalPayment=0;
        for(Map.Entry<Product,Integer> entryItem:products.entrySet())
        {
            totalPayment+= entryItem.getKey().getPrice()*entryItem.getValue();
        }
        return totalPayment;
    }
}
