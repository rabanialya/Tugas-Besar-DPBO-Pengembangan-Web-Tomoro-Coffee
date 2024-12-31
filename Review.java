/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Lenovo
 */
public class Review {
    private String customerName;
    private String reviewText;
    private int rating;

    public Review(String customerName, String reviewText, int rating) {
        this.customerName = customerName;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public void displayReview() {
        System.out.println(customerName + " (" + rating + "/5):");
        System.out.println("\"" + reviewText + "\"");
        System.out.println();
    }
}
