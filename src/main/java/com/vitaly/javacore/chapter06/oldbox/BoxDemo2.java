package main.java.com.vitaly.javacore.chapter06.oldbox;


public class BoxDemo2 {
    public static void main(String[] args) {
        OldBox mybox1 = new OldBox();
        OldBox mybox2 = new OldBox();
        double vol;
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }
}
