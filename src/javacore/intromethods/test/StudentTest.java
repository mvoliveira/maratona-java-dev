package javacore.intromethods.test;

import javacore.intromethods.classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student jairo = new Student();
        jairo.setName("Jairão");
        jairo.setAge(18);
        jairo.setAssessments(new double[]{8,9,9});

        jairo.printStudent();
        jairo.average();

    }
}