package javacore.overload.test;

import javacore.overload.classes.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee cleomar = new Employee();

        cleomar.init("Cleomaree", 58, 4000);
        cleomar.print();
    }
}
