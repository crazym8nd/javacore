package main.java.com.vitaly.javacore.chapter09;

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);

    }

    void nonIfaceMeth() {
        System.out.println("В классах реализующих интерфейсы" + " могут определяться и другие члены");
    }
}
