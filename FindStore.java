/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.*;
/**
 *
 * @author Lenovo
 */
public class FindStore {
    private Map<String, Coordinates> storeMap;

    public FindStore() {
        this.storeMap = new HashMap<>();
    }

    public void addStore(String name, double latitude, double longitude) {
        storeMap.put(name, new Coordinates(latitude, longitude));
    }

    public void showStoreLocation(String name) {
        if (storeMap.containsKey(name)) {
            System.out.println("Store: " + name);
            storeMap.get(name).displayDetails();
        } else {
            System.out.println("Store not found: " + name);
        }
    }

    public void displayAllStores() {
        System.out.println("All Stores:");
        for (Map.Entry<String, Coordinates> entry : storeMap.entrySet()) {
            System.out.println("\n- " + entry.getKey());
            entry.getValue().displayDetails();
        }
    }
}
