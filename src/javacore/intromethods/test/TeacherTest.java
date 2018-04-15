package javacore.intromethods.test;

import javacore.intromethods.classes.Teacher;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher marco = new Teacher();
        marco.name = "marco";
        marco.rg = "13123.123.35-2";
        marco.registration = 156651;
        marco.cpf = 1233;
        marco.printTeacher(marco);

        Teacher carol= new Teacher();
        carol.name = "carol";
        carol.rg = "134553.123.35-2";
        carol.registration = 5546;
        carol.cpf = 623;
        carol.printTeacher(carol);
    }
}

