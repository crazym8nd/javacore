package main.java.com.vitaly.javacore.chapter02;

import java.sql.SQLOutput;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) System.out.println("х меньше у");
        x = x * 2;
        if (x == y) System.out.println("х теперь равно у");
        x = x * 2;
        if (x > y) System.out.println("х теперь больше у");
        if (x == y) System.out.println("Вы не увидите этого");
    }
}
