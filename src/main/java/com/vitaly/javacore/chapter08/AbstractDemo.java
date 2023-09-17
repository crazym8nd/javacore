package main.java.com.vitaly.javacore.chapter08;

abstract class Abs {
    abstract void callme();

    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class Bbs extends Abs {
    void callme() {
        System.out.println("Реализация метода callme() из класса Bbs.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        Bbs b = new Bbs();
        b.callme();
        b.callmetoo();
    }
}
