package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User firstUser= new User();
        firstUser.setUserId(15244785);
        firstUser.setName("Emre");
        firstUser.setSurname("Horuzoglu");
        firstUser.setMail("emrehoruzoglu96@gmail.com");
        firstUser.setPassword("123");
        firstUser.setMailAccept(true);
        firstUser.setPrivacyPolicy(true);
        Instructor firstInstructor= new Instructor();
        firstInstructor.setUserId(154789654);
        Student student =new Student();
        student.setUserId(447558695);
        User [] users = {firstUser};
        Instructor[] instructors={firstInstructor};
        Student[] students={student};
        UserManager userManager = new UserManager();
        userManager.addMultipleUser(users);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addMultipleInstructor(instructors);
        StudentManager studentManager = new StudentManager();
        studentManager.addMultipleStudent(students);
    }

}
