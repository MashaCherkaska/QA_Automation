package com.hillel.lessons.project.project1.clinics;

import com.hillel.lessons.project.project1.abstracts.Facility;
import com.hillel.lessons.project.project1.interfaces.HealthCare;

public class PrivateClinic extends Facility implements HealthCare {

    private String district;
    private int award;


    public PrivateClinic(int areaSize, double rating, int quantityOfDoctors, String location, String type, int award) {
        super(areaSize, rating, quantityOfDoctors, location);
        this.district = district;
        this.award = award;
    }

    public void calculateRating(){
        double rating = getRating();
        for (int i = 0; i < award; i++) {
            rating += 1;

        }

        setRating(rating);


    }

    @Override
    public void checking() {
        System.out.println("The Private Clinic is checked" );
    }
}
