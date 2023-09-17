package main.java.com.vitaly.javacore.chapter05;

public class Return {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("До возврата.");
        if (t) return;
        System.out.println("этот оператор выполняться не будет");
    }
}
