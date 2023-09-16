package main.java.com.vitaly.javacore.chapter08;

class A{
    int i,j;
    void shiwij(){
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+ k);
    }
    void sum(){
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B suboB = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое обьекта superOb: ");
        superOb.shiwij();
        System.out.println();

        suboB.i = 7;
        suboB.j = 8;
        suboB.k = 9;
        System.out.println("Содержимое обьекта suboB: ");
        suboB.shiwij();
        suboB.showk();

        System.out.println();
        System.out.println("Сумма i , j и k в обьекте suboB: ");
        suboB.sum();
    }
}
