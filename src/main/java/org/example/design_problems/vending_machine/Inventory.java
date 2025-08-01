package org.example.vending_machine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Inventory {

    private final Map<Product, Integer> products;

    public Inventory() {
        products = new ConcurrentHashMap<Product, Integer>();
    }

    public void addProduct(Product product, int quantity) {
        products.put(product, quantity);
    }

    public void removeProduct(Product product, int quantity) {
        products.remove(product);

    }

    public void updateQuantity(Product product, int quantity) {
        products.put(product, quantity);
    }

    public int getQuantity(Product product) {
        return products.getOrDefault(product, 0);
    }

    public boolean isAvailable(Product product) {
        return products.containsKey(product) && products.get(product) > 0;
    }
}
