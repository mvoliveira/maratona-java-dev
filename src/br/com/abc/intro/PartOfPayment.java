package br.com.abc.intro;

public class PartOfPayment {
    public static void main(String[] args) {
        double value = 30000;

        for (int partOfPayment = 1; partOfPayment < value; partOfPayment++) {
            double valuePart = value / partOfPayment;
            if (valuePart < 1000) {
                break;
            }
            System.out.println(valuePart);
        }
    }
}
