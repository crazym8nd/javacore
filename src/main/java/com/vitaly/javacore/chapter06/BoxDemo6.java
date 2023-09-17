package main.java.com.vitaly.javacore.chapter06;

class BoxCons10 {
    double width;
    double height;
    double depth;

    BoxCons10() {
        System.out.println("Конструирование класса Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        BoxCons10 mybox1 = new BoxCons10();
        BoxCons10 mybox2 = new BoxCons10();

        double vol;
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);

    }
}
