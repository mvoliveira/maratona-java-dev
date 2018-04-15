package javacore.intromethods.classes;

public class Teacher {
    public String name;
    public String rg;
    public int registration;
    public int cpf;

    public void printTeacher(Teacher teacher) {
        System.out.println(teacher.name);
        System.out.println(teacher.rg);
        System.out.println(teacher.registration);
        System.out.println(teacher.cpf);
    }
}
