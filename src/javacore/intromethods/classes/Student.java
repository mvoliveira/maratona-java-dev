package javacore.intromethods.classes;

public class Student {

    public String name;
    public int age;
    public double[] assessments;

    public void printStudent() {
        System.out.println(this.name);
        System.out.println(this.age);
        for (double assessment : assessments) {
            System.out.print(assessment + ", ");
        }
    }

    public void average() {
        double average = 0;
        for (double assessment : assessments) {
            average += assessment;
        }
        average = average / assessments.length;
        System.out.println("Média: " + average);
        if (average > 6){
            System.out.println("aprovado");
        } else{
            System.out.println("reprovado");
        }
    }
}
