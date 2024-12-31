/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class Homepage {
    private String aboutSection;
    private List<String> slideshow;

    public Homepage() {
        this.aboutSection = "Tomoro Coffee adalah merek kopi modern yang berdedikasi untuk menyajikan minuman berkualitas tinggi.\n"
                          + "Kami menggabungkan seni tradisional penyeduhan kopi dengan teknologi terkini untuk menciptakan pengalaman unik.\n"
                          + "Dengan berbagai cabang di seluruh Indonesia, Tomoro Coffee bertujuan menjadi tujuan favorit pecinta kopi.\n"
                          + "Nikmati minuman, makanan, dan merchandise eksklusif kami di setiap kunjungan.\n"
                          + "Temukan rasa, kualitas, dan inovasi hanya di Tomoro Coffee <3";

        this.slideshow = new ArrayList<>();
        this.slideshow.add("Experience the best coffee brewing!");
        this.slideshow.add("Visit our stores across Indonesia.");
        this.slideshow.add("Taste the innovation in every cup.");
        this.slideshow.add("Find your favorite drink at Tomoro Coffee.");
    }

    public void displayAboutSection() {
        System.out.println("\n=== About Tomoro Coffee ===");
        System.out.println(aboutSection);
    }

    public void displaySlideshow() {
        System.out.println("\n--- Slideshow ---");
        for (String slide : slideshow) {
            System.out.println("- " + slide);
        }
    }

    public void addSlide(String slide) {
        slideshow.add(slide);
    }

    public void removeSlide(String slide) {
        slideshow.remove(slide);
    }
}
