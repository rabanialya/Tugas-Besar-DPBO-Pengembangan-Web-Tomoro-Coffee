/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Lenovo
 */
public class Product extends BaseEntity implements Displayable{
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isPromo;

    public Product(int id, String createdAt, String name, String description, double price, String category, boolean isPromo) {
        super(id, createdAt);
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isPromo = isPromo;
    }

    public String getCategory() {
        return category;
    }

    public boolean isPromo() {
        return isPromo;
    }

    @Override
    public void display() {
        System.out.println("Product Name: " + name);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Description: " + description);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        if (isPromo) {
            System.out.println("** This product is on promo! **");
        }
    }

    @Override
    public void displaySummary() {
        System.out.println(name + " - $" + price + (isPromo ? " (Promo)" : " "));
    }
}
