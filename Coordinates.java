/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Lenovo
 */
public class Coordinates implements Displayable{ 
    private double latitude;
    private double longitude;

    public Coordinates(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void display() {
        System.out.println("Coordinates: " + latitude + ", " + longitude);
    }

    @Override
    public void displayDetails() {
        System.out.println("Full Coordinates: Latitude: " + latitude + ", Longitude: " + longitude);
        System.out.println("Google Maps Link: https://www.google.com/maps?q=" + latitude + ",\n" + longitude);
    }

    @Override
    public void displaySummary() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}
