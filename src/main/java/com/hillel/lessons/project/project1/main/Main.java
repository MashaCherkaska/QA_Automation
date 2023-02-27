package com.hillel.lessons.project.project1.main;

import com.hillel.lessons.project.project1.clinics.NightClinic;
import com.hillel.lessons.project.project1.clinics.PrivateClinic;
import com.hillel.lessons.project.project1.clinics.StateClinic;
import com.hillel.lessons.project.project1.enums.WorkDate;

public class Main {

    public static void main(String[] args) {
        PrivateClinic privateClinic = new PrivateClinic(200, 1, 10, "Kiev", "Private", 33);
        privateClinic.calculateRating();
        System.out.println("Rating of Private Clinic is " + privateClinic.getRating());
        privateClinic.checking();


        StateClinic stateClinic = new StateClinic(420, 1, 19, "Dnipro", "Government", 1976);
        stateClinic.printInfo();

        NightClinic nightClinic = new NightClinic(190, 1, 8, "Lviv", WorkDate.TUESDAY);
        System.out.println(nightClinic.toString());
        nightClinic.checking();


    }
}
