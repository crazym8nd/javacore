package main.java.com.vitaly.javacore.chapter09;

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Еще один вариант метода callback()");
        System.out.println(" p в квадрате равно " + p * p);
    }
}

class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();
        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
