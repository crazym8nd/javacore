package main.java.com.vitaly.javacore.chapter08;

import javax.swing.*;

class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box8 plainbox = new Box8();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Объем plainbox равен " + vol);
        //System.out.println("Вес plainbox равен " + plainbox.weight);
    }
}
