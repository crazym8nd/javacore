package main.java.com.vitaly.javacore.chapter05;

public class NoBody {
    public static void main(String[] args) {
        int i,j;
        i = 100;
        j = 200;
        while ( ++i < --j);
        System.out.println("Cреднее значенние равно " +i);
    }
}
