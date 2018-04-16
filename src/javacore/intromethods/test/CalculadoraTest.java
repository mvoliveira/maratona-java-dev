package javacore.intromethods.test;

import javacore.intromethods.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.addTwoNumbers();
        calculadora.subtractTwoNumbers();
        calculadora.multiplyTwoNumbers(5,5);
        System.out.println(calculadora.divideTwoNumbers(20,0));

        int nNumbers[] = {14,12,23,4};
        calculadora.addNNumbers(nNumbers);
    }
}
