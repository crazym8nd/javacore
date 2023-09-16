package main.java.com.vitaly.javacore.chapter08;

abstract class Ffigure{
    double dim1;
    double dim2;

    Ffigure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();

}
class Rrectangle extends Ffigure{
    Rrectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области четырехугольника.");
        return dim1*dim2;
    }
}

class Tttriangle extends Ffigure{
    Tttriangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("В области треугольника.");
        return dim1*dim2/2;
    }
}
class AbstractAreas{
    public static void main(String[] args) {
        Rrectangle r = new Rrectangle(9,5);
        Tttriangle t = new Tttriangle(10,8);
        Ffigure figref;

        figref = r;
        System.out.println("Площадь равна " + figref.area());

        figref = t;
        System.out.println("Площадь равна " + figref.area());

    }
}
