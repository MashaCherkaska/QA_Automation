package com.hillel.lessons.project.project1.clinics;

import com.hillel.lessons.project.project1.abstracts.Facility;
import com.hillel.lessons.project.project1.enums.WorkDate;
import com.hillel.lessons.project.project1.interfaces.HealthCare;

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
