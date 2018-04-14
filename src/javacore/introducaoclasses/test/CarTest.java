package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Car;

public class CarTest {

    public static void main(String[] args) {
        Car fusca = new Car();
        fusca.model = "Fusca";
        fusca.plate = "88-12AS";
        fusca.maxSpeed = 80;
        System.out.println(fusca.model);
        System.out.println(fusca.plate);
        System.out.println(fusca.maxSpeed);
    }
}
