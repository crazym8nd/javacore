package main.java.com.vitaly.javacore.chapter09;

class A {
    public interface nestedIF {
        boolean isNotNegative(int x);
    }
}

class B implements A.nestedIF {
    public boolean isNotNegative(int x) {
        return x >= 0;
    }
}

class NestedIFDemo {
    public static void main(String[] args) {
        A.nestedIF nif = new B();
        if (nif.isNotNegative(10))
            System.out.println("Число не отрицательное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
