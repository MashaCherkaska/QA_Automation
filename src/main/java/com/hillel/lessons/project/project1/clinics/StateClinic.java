package com.hillel.lessons.project.project1.clinics;

import com.hillel.lessons.project.project1.abstracts.Facility;

public class StateClinic extends Facility {

    private String typeOfClinic;
    private int foundationDate;


    public StateClinic(int areaSize, double rating, int quantityOfDoctors, String location, String typeOfClinic, int foundationDate) {
        super(areaSize, rating, quantityOfDoctors, location);
        this.typeOfClinic = typeOfClinic;
        this.foundationDate = foundationDate;
    }

    public int getFoundationDate() {
        return foundationDate;
    }

    public String getTypeOfClinic() {
        return typeOfClinic;
    }

    public void printInfo() {
        int ageOfClinic = 2023 - getFoundationDate();
        System.out.print("Info of State Clinic: ");
        System.out.println("Type of clinic is " + getTypeOfClinic() + " , the existence of clinic is " + ageOfClinic + " years. ")
               ;


    }
}
