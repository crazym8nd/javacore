package main.java.com.vitaly.javacore.chapter08;

class A8{
    int i;
}
class B8 extends A8{
    int i;
    B8(int a, int b){
        super.i=a;
        i = b;
    }

    void show(){
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}
public class UseSuper {
    public static void main(String[] args) {
        B8 subOb = new B8(1,2);

        subOb.show();
    }
}
