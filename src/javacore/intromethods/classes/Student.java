package javacore.intromethods.classes;

public class Student {

    public String name;
    public int age;
    public double[] assessments;

    public void printStudent() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (assessments != null) {
            for (double assessment : assessments) {
                System.out.println(assessment + ", ");
            }
        }
    }

    public void average() {
        if (assessments == null) {
            System.out.println("Este aluno não possui notas");
            System.out.println("O aluno foi reprovado");
            return;
        }
        double average = 0;
        for (double assessment : assessments) {
            average += assessment;
        }
        average = average / assessments.length;
        System.out.println("A média é: " + average);
        if (average > 6) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
