package main.java.com.vitaly.javacore.chapter06;

public class BoxDemo5 {
    public static void main(String[] args) {
        BoxNoConstructor mybox1 = new BoxNoConstructor();
        BoxNoConstructor mybox2 = new BoxNoConstructor();
        double vol;
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
