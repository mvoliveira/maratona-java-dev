package javacore.intromethods.test;

import javacore.intromethods.classes.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student jairo = new Student();
        jairo.setName("Jairão");
        jairo.setAge(41);
        jairo.setAssessments(new double[]{8, 1, 1});


        jairo.printStudent();
        jairo.average();
        System.out.println("Estudante aprovado?" + jairo.isApproved());

    }
}