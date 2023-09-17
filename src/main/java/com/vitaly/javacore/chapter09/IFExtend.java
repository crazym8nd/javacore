package main.java.com.vitaly.javacore.chapter09;

interface Aa {
    void meth1();

    void meth2();
}

interface Bb extends Aa {
    void meth3();
}

class MyClass implements Bb {
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();

    }
}
