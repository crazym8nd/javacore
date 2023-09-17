package main.java.com.vitaly.javacore.chapter07;

class OverloadDemo1 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a и b:" + a + " " + b);
    }

    double test(double a) {
        System.out.println("a: " + a);
        return a;
    }
}

class Overload1 {
    public static void main(String[] args) {
        OverloadDemo1 ob = new OverloadDemo1();
        double result;

        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println("результат вызова ob.test(123.25): " + result);

    }
}
