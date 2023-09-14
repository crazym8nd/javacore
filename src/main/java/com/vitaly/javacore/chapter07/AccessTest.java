package main.java.com.vitaly.javacore.chapter07;

class Testt{
    public int b;
    int a;
    private int c;
    void setc(int i){
        c = i;
    }
    int getc(){
        return c;
    }
}
public class AccessTest {
    public static void main(String[] args) {
        Testt ob = new Testt();
        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a,b,c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
