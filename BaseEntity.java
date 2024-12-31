/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Lenovo
 */
public class BaseEntity {
    protected int id;
    protected String createdAt;

    public BaseEntity(int id, String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }
}
