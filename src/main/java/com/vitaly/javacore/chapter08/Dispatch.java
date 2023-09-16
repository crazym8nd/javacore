package main.java.com.vitaly.javacore.chapter08;

class Ad{
    void callme(){
        System.out.println("В методе callme() из класса Ad");
    }
}
class Bd extends Ad{
    void callme(){
        System.out.println("В методе callme() из класса Bd");
    }
}
class Cd extends Ad{
    void callme(){
        System.out.println("В методе callme() из класса Cd");
    }
}
class Dispatch {
    public static void main(String[] args) {
        Ad a = new Ad();
        Bd b = new Bd();
        Cd c = new Cd();
        Ad r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r=c;
        r.callme();
    }
}
