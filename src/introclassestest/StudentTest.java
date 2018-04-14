package introclassestest;

import javacore.introducaoclasses.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student jorge = new Student();
        jorge.name = "João";
        jorge.age = 12;
        jorge.registration = 123123;

        System.out.println(jorge.name);
        System.out.println(jorge.age);
        System.out.println(jorge.registration);
    }
}
