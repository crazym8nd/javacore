package main.java.com.vitaly.javacore.chapter05;

public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        while (!done) {
            System.out.println("i равно " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
