package javacore.intromethods.test;

import javacore.intromethods.classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student jairo = new Student();
        jairo.name = "jairooo";
        jairo.age = 18;
        double[] assessments = {4,6,4};
        jairo.assessments = assessments;

        jairo.printStudent();
        jairo.average();

    }
}