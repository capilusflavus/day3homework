package com.company;

public class InstructorManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.userId + " nolu ınstructor kaydedildi.");
    }

    public void addMultipleInstructor(Instructor[] instructors) {
        for (Instructor instructor : instructors) {
            add(instructor);
        }
    }
}