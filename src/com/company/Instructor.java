package com.company;

import java.util.ArrayList;

public class Instructor extends User {
    String companyName;
    String[] courses;

    public Instructor() {
    }

    public Instructor(String companyName, String[] courses) {
        this.companyName = companyName;
        this.courses = courses;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }
}
