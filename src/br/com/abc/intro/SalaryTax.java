package br.com.abc.intro;

public class SalaryTax {
    public static void main(String[] args) {
        double salary = 5001;
        double totalTax = 0;
    if (salary < 1000) {
        totalTax = salary * 5/100;
    } else if (salary >= 1000 && salary < 2000){
        totalTax = salary * 10/100;
    } else if (salary >= 2000 && salary < 4000){
        totalTax = salary * 15/100;
    } else if (salary > 5000){
        totalTax = salary * 20/100;
    }
        System.out.println(totalTax);
    }
}