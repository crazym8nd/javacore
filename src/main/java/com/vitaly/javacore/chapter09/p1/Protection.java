package main.java.com.vitaly.javacore.chapter09.p1;

public class Protection {
    public int n_pub = 4;
    protected int n_pro = 3;
    int n = 1;
    private final int n_pri = 2;

    public Protection() {
        System.out.println("конструктор базового класса");
        System.out.println("n = " + n);
        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
