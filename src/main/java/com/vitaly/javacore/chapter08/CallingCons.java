package main.java.com.vitaly.javacore.chapter08;

class A888{
    A888(){
        System.out.println("В конструкторе A888.");
    }
}
class B888 extends A888{
    B888(){
        System.out.println("В конструкторе B888.");
    }
}
class C888 extends B888{
    C888(){
        System.out.println("В конструкторе C888.");
    }
}
 class CallingCons {
     public static void main(String[] args) {
         C888 c = new C888();
     }
}
