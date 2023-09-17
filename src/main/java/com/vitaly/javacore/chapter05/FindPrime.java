package main.java.com.vitaly.javacore.chapter05;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 14;
        isPrime = num >= 2;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("простое число");
        else System.out.println("Не простое число");
    }
}
