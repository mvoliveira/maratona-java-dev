package br.com.abc.intro;

public class EvenNumbers {
    public static void main(String[] args) {
        int length = 100000;
        for(int i = 0; i < length; i++){
            if(i%2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
