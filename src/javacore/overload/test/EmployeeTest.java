package javacore.overload.test;

import javacore.overload.classes.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee cleomar = new Employee();

        cleomar.setName("Cleomari");
        cleomar.setAge(32);
        cleomar.setSalary(4800);

        System.out.println(cleomar.getName());
        System.out.println(cleomar.getAge());
        System.out.println(cleomar.getSalary());
    }
}
