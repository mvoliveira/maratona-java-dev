package javacore.intromethods.test;

import javacore.intromethods.classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student jairo = new Student();
        jairo.name = "jairooo";
        jairo.age = 18;
        jairo.assessments = new double[]{9, 7, 4};

        jairo.printStudent();
        jairo.average();

    }
}