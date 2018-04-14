package intromethods.test;

import intromethods.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.addTwoNumbers();
        calculadora.subtractTwoNumbers();
        calculadora.multiplyTwoNumbers(5,5);
    }
}
