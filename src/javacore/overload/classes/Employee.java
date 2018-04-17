package javacore.overload.classes;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int rg;

    public void init(String name, int age, double salary){
        this.name = name;
        this.age= age;
        this.salary = salary;
    }

    public void init(String name, int age, double salary, int rg){
        this.name = name;
        this.age= age;
        this.salary = salary;
        this.rg = rg;

    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.salary);
        System.out.println(this.rg);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setRg(int rg){
        this.rg = rg;
    }

    public int getRg(){
        return rg;
    }
}
