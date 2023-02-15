package com.hillel.lessons.project.project1;

public enum WorkDate {
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    FRIDAY("Friday"),
    SUNDAY("Sunday");

    private String workDate;

    WorkDate(String workDate){
        this.workDate=workDate;
    }

    public String getWorkDate() {
        return workDate;
    }
}
