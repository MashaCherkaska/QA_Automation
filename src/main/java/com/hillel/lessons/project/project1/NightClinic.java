package com.hillel.lessons.project.project1;

public final class NightClinic extends Facility implements HealthCare {

    private WorkDate workDate;


    public NightClinic(int areaSize, double rating, int quantityOfDoctors, String location, WorkDate workDate ) {
        super(areaSize, rating, quantityOfDoctors, location);
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Night Clinic " +
                "works on " + workDate.getWorkDate() +
                '.';
    }

    @Override
    public void checking() {
        System.out.println( "The Night Clinic is checked.");
    }
}
