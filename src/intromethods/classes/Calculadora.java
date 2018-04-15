package intromethods.classes;

public class Calculadora {
    public void addTwoNumbers() {
        System.out.println(5 + 5);
    }

    public void subtractTwoNumbers() {
        System.out.println(5 - 5);
    }

    public void multiplyTwoNumbers(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    public double divideTwoNumbers(int firtsNumber, int secondNumber) {
        if (secondNumber != 0) {
            return firtsNumber / secondNumber;
        }
        return 0;
    }

    public void changeTwoNumbers(int firstNumber, int secondNumber){
        firstNumber = 10;
        secondNumber = 20;

        System.out.println("Dentro do altera dois números");
        System.out.println("Primeiro número: " + firstNumber);
        System.out.println("Segundo número: " + secondNumber);
    }

}
