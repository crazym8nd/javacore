package main.java.com.vitaly.javacore.chapter06.oldbox;

class OldBox {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        OldBox mybox = new OldBox();
        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Объем равен " + vol);
    }
}
