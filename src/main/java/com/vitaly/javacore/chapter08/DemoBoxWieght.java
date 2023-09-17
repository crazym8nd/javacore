package main.java.com.vitaly.javacore.chapter08;

class Box8 {

    double width;
    double height;
    double depth;

    Box8(Box8 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box8(double w, double h, double d) {

        width = w;
        height = h;
        depth = d;
    }

    Box8() {

        width = -1;
        height = -1;
        depth = -1;
    }

    Box8(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box8 {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
    }
}

