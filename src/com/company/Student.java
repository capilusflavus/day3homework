package com.company;

public class Student extends User {
    String schoolName;
    String departmentName;
    String schoolYear;

    public Student() {
    }
    public Student(int userId, String name, String surname, String mail, String password, boolean isMailAccept, boolean isPrivacyPolicy, String schoolName, String departmentName, String schoolYear) {
        super(userId, name, surname, mail, password, isMailAccept, isPrivacyPolicy);
        this.schoolName = schoolName;
        this.departmentName = departmentName;
        this.schoolYear = schoolYear;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }
}
