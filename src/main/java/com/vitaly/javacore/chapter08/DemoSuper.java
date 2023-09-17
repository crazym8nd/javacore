package main.java.com.vitaly.javacore.chapter08;


class Box88 {

    double width;
    double height;
    double depth;

    Box88(Box88 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box88(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    Box88() {

        width = -1;
        height = -1;
        depth = -1;
    }

    Box88(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight8 extends Box88 {
    double weight;

    BoxWeight8(BoxWeight8 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight8(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight8() {
        super();
        weight = -1;
    }

    BoxWeight8(double len, double m) {
        super(len);
        weight = m;
    }
}


public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight8 mybox1 = new BoxWeight8(10, 20, 15, 34.3);
        BoxWeight8 mybox2 = new BoxWeight8(2, 3, 4, 0.076);
        BoxWeight8 mybox3 = new BoxWeight8();
        BoxWeight8 mycube = new BoxWeight8(3, 2);
        BoxWeight8 myclone = new BoxWeight8(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен " + vol);
        System.out.println("Вес mybox3 равен " + mybox3.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

    }
}
