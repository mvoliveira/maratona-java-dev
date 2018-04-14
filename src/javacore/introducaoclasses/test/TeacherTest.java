package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher marco = new Teacher();

        marco.name = "Marco";
        marco.cpf = "432324232";
        marco.registration = "12312123";
        marco.rg = "1312312312";

        System.out.println(marco.name);
        System.out.println(marco.cpf);
        System.out.println(marco.registration);
        System.out.println(marco.rg);
    }
}
