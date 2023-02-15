package com.hillel.lessons.project.project1;

public abstract class Facility {

    private int areaSize;
    private double rating;
    private int quantityOfDoctors;
    private String location;


    public Facility(int areaSize, double rating, int quantityOfDoctors, String location) {
        this.areaSize = areaSize;
        setRating(rating);
        this.quantityOfDoctors = quantityOfDoctors;
        this.location = location;
    }

    public Facility() {
    }



    public int getAreaSize() {
        return areaSize;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0) {
            this.rating = rating;
        } else {
        this.rating = 0;
        }
    }


    public int getQuantityOfDoctors() {
        return quantityOfDoctors;
    }

}
