package main.java.com.vitaly.javacore.chapter05;

public class Break {
    public static void main(String[] args) {
        boolean t = true;

        {
            second:
            {
                {
                    System.out.println("Предшествует оператору break.");
                    if (t) break second;
                    System.out.println("Этот оператор не будет выполняться");
                }
                System.out.println("Этот оператор не будет выполняться");
            }
            System.out.println("Этот оператор следует за блоком секонд");
        }
    }
}
