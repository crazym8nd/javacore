package main.java.com.vitaly.javacore.chapter07;

class Boxx {
    double width;
    double height;
    double depth;

    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Boxx() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Boxx(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }

}

class OverloadCons {
    public static void main(String[] args) {
        Boxx mybox1 = new Boxx(10, 20, 15);
        Boxx mybox2 = new Boxx();
        Boxx cmycube = new Boxx(7);

        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        vol = cmycube.volume();
        System.out.println("Объем cmycube равен " + vol);
    }
}
