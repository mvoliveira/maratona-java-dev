package javacore.intromethods.classes;

public class Student {

    private String name;
    private int age;
    private double[] assessments;
    private boolean approved;

    public void printStudent() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (this.assessments != null) {
            for (double assessment : this.assessments) {
                System.out.println(assessment + ", ");
            }
        }
    }

    public void average() {
        if (this.assessments == null) {
            System.out.println("Este aluno não possui notas");
            System.out.println("O aluno foi reprovado");
            return;
        }
        double average = 0;
        for (double assessment : this.assessments) {
            average += assessment;
        }
        average = average / this.assessments.length;
        System.out.println("A média é: " + average);
        if (average > 6) {
            this.approved = true;
            System.out.println("O aluno foi aprovado");
        } else {
            this.approved = false;
            System.out.println("O aluno foi reprovado");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Você não pode ter menos que 0 anos.");
            return;
        }
        this.age = age;
    }

    public void setAssessments(double[] assessments) {
        this.assessments = assessments;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double[] getAssessments() {
        return this.assessments;
    }

    public boolean isApproved() {
        return this.approved;
    }
}
