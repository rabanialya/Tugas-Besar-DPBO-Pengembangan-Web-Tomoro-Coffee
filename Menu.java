/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Lenovo
 */
public class Menu {
    private Map<String, List<Product>> categorizedProducts;

    public Menu() {
        this.categorizedProducts = new HashMap<>();
    }

    public void addProduct(Product product) {
        categorizedProducts.computeIfAbsent(product.getCategory(), k -> new ArrayList<>()).add(product);
    }

    public void displayByCategory(String category) {
        if (categorizedProducts.containsKey(category)) {
            System.out.println("Products in category: " + category);
            for (Product product : categorizedProducts.get(category)) {
                product.displayDetails();
            }
        } else {
            System.out.println("No products found in category: " + category);
        }
    }

    public void displayPromoProducts() {
        System.out.println("Promo Products:");
        for (List<Product> products : categorizedProducts.values()) {
            for (Product product : products) {
                if (product.isPromo()) {
                    product.displayDetails();
                }
            }
        }
    }

    public void displayAllCategories() {
        System.out.println("Available Categories:");
        for (String category : categorizedProducts.keySet()) {
            System.out.println("- " + category);
        }
    }
}
