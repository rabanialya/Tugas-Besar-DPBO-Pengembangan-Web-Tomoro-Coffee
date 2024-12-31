/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Lenovo
 */
public class JobOpening extends BaseEntity implements Displayable{
    private String title;
    private String description;
    private String location;
    private String email; 

    public JobOpening(int id, String createdAt, String title, String description, String location, String email) {
        super(id, createdAt);
        this.title = title;
        this.description = description;
        this.location = location;
        this.email = email;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void display() {
        System.out.println("Job Title: " + title);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nLocation: " + location);
        System.out.println("Description: " + description);
        System.out.println("Email to send CV: " + email); // Display email
    }

    @Override
    public void displaySummary() {
        System.out.println(title + " at " + location + " | Send CV to: " + email);
    }
}
