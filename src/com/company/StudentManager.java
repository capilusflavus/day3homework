package com.company;

public class StudentManager {
    public void add(Student student) {
        System.out.println(student.userId + " nolu student kaydedildi.");
    }

    public void addMultipleStudent(Student[] students) {
        for (Student student : students) {
            add(student);
        }
    }
}