/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */
public class ReviewFeature {
    private List<Review> reviews;

    public ReviewFeature() {
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public void displayAllReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews yet.");
        } else {
            System.out.println("\n--- Customer Reviews ---");
            for (Review review : reviews) {
                review.displayReview();
            }
        }
    }
}
