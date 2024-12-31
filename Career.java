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
public class Career {
    private List<JobOpening> jobOpenings;

    public Career() {
        this.jobOpenings = new ArrayList<>();
    }

    public void addJobOpening(JobOpening jobOpening) {
        jobOpenings.add(jobOpening);
    }

    public void listJobOpenings() {
        System.out.println("Available Job Openings:");
        for (JobOpening job : jobOpenings) {
            job.displayDetails();
        }
    }
}
